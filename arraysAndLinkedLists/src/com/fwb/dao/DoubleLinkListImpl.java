package com.fwb.dao;

import com.fwb.impl.IDoubleLinked;

/*
双向循环单链表
 */
public class DoubleLinkListImpl implements IDoubleLinked {

    class Node{
        private int data;
        private Node prev;//前驱
        private Node next;//后继

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;//标志头
    private Node last;//标志尾
    public DoubleLinkListImpl(){
        this.head = null;
        this.last = null;
    }
    /*
    头插
    1.首先判断是否为第一个节点，如果是的话，将head，last指向新节点（即设置1这个新节点为头、尾节点）
    2.如果不是那么将此时head节点（现链表的第一个节点）的地址交给node.next（告诉node，现链表第一个节点为他的后驱）
    3.将新节点的地址交给现链表第一个节点的prev（告诉现在的第一个节点，node为他的前驱）
    4.将head指向node（新的头结点）
     */


    @Override
    public void addFirst(int data) {
        //第一次插入
        Node node = new Node(data);
        if (head == null){
            this.head = node;
            this.last = node;
        }else{
            node.next = this.head;//先将新的节点与现链表的第一个连起来
            node.next.prev = node;
            this.head = node;
        }
    }
    /*
    尾插
    1.先判断是否第一此插入，如果是第一次则与头插一样
    2.如果不是则将node地址存于现链表的最后一位（last）的next中
    3.再将现链表最后一位节点的地址存入last的前驱中
    4.
     */
    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null){
            this.head = node;
            this.last = node;
        }else{
            last.next = node;
            node.prev = last;
            this.last = node;
        }
    }

    //判断index合法性，index不能比0小，不能大于链表长度，但是可以等于
    private void checkIndex(int index){
        if(index < 0 || index > getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }
    /*找到index所在位
      定义一个cur节点在head位置，之后向后推移，从0走index步可以走到index位置
      找到后返回cur,将来新的节点将要插在cur前
    */
    private Node searchIndex(int index){
        checkIndex(index);
        Node cur = this.head;
        int count = 0;
        while(count < index){
            cur =cur.next;
            count++;
        }
        return cur;
    }
    /*
    需要判断头、尾插入
    给index位置插入数据为data的节点
    找到位置之后，共有4个部分需要改变
    第一步先将cur的地址存于新节点中（新节点的下一位为cur），
    但是接下来先不能将cur的前驱指向node，如果直接这样，将会丢失cur的前驱节点位置
    第二部应该将新节点node的地址交给cur的上一位的next（即让cur的上一位的下一位设为node，将node放入他们之间）
    第三步将cur的上一位设为node的上一位
    最后将cur的前驱指向新的节点node
     */
    @Override
    public boolean addIndex(int index, int data) {
        if (index == 0){
            addFirst(data);
            return true;
        }
        if (index == getLength()){
            addLast(data);
            return true;
        }else{
            Node node = new Node(data);
            Node cur = searchIndex(index);
            node.next = cur;
            cur.prev.next = node;
            node.prev = cur.prev;
            cur.prev = node;
            return true;
        }
    }

    /*
    是否包含data==key的节点
    定义cur从前向后遍历，如果有key则返回true，否则返回false
     */
    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public int delete(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                int oldData = cur.data;
                //删除的节点为头结点,将head的下一位设为头结点，将head下一位的prev设为null，即可删除
                if (cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }
                else{
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        //删除最后一个节点last需要指回来
                        this.last = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    /*
找到倒数第k个数。。
 */
    @Override
    public void deleteAllkey(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                //删除的节点为头结点,将head的下一位设为头结点，将head下一位的prev设为null，即可删除
                if (cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }
                else{
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        //删除最后一个节点last需要指回来
                        this.last = cur.prev;
                    }
                }
                //return oldData;
            }
            cur = cur.next;
        }
        //return -1;
    }

    @Override
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
//        this.head = null;
//        this.last = null;
        while(this.head != null){
            Node cur = this.head.next;
            this.head = null;
            head = cur;
        }
        this.last = null;
    }


    public void ex2(int value){
        Node newNode = new Node(value);
        Node cur = head;
        if (head==null){
            head = newNode;
        }
        while(cur != null){
            if (cur.data != value){
                last.next = newNode;
                newNode.prev = last;
            }
            cur = cur.next;
        }
    }
}
