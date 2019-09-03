package com.fwb.dao;

import com.fwb.impl.CirculationHeadLinkList;

/*
循环带头单链表，比不带头结点多了一个节点储存最后一个节点的地址
 */
public class CHeadSingleListImpl implements CirculationHeadLinkList {

    public class Node{
        private Node next;
        private int data;

        public Node(){
            this.data = -1;//先用-1标识一下,head.data不存数据
        }

        public Node(int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }
    private Node head;

    public CHeadSingleListImpl() {
        this.head = new Node();
        //循环单链表的初始化，还是要循环，开始什么都没有的话就自己指向自己
        this.head.next = this.head;
    }

    //头插，将头结点的next中所存的第一个节点的地址交给新节点的next，
    // 再将头节点的next中放入新节点的地址
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = this.head.next;
        this.head.next = node;
    }

    //尾插，从前向后遍历，找到现链表的最后一个节点cur
    //之后将要加入的节点的next指向头节点（将头结点的地址交给新节点的next），
    //将现列表的next指向要加入的节点（将新节点的地址交给cur的next）
    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        while(cur.next != head){
            cur = cur.next;

        }
        node.next = this.head;
        cur.next = node;
    }

    //判断index合法性，index不能比0小，不能大于链表长度，但是可以等于
    private void checkIndex(int index){
        if(index < 0 || index > getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }

    //在指定位置插入数据，首先需要定义一个函数，判断index合法性↑↑↑↑↑
    //让cur走到要插入位置的前一个位置（如果要插入3号位置，cur需要从头结点走3步）
    //将cur保存的要插入的位置的下一个节点的地址交给要插入节点的next
    //将要插入的节点的地址交给cur.next
    @Override
    public boolean addIndex(int index, int data) {
        checkIndex(index);
        Node cur = this.head;
        Node node = new Node(data);
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    //判断是否有key
    //先定义cur节点为有效节点的第一个
    //之后cur从前向后遍历，如果遍历途中遇见节点的data是要找的数据则返回true
    //否则继续向后直到找到key，或者走到尽头返回false
    @Override
    public boolean contains(int key) {
        Node cur = head.next;
        while(cur.next != this.head){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找data == key的节点的前驱节点
    //先定义一个节点pre，从头结点位置向后遍历
    //如果pre节点的下一个节点的data == key那么返回pre，此时pre即为所要找的节点前驱节点
    private Node searchKey(int key){
        Node pre = this.head;
        while(pre.next != this.head){
            if(pre.next.data == key){
                return pre;
            }
            pre = pre.next;
        }
        return null;
    }

    //删除data == key的节点
    //定义pre节点为要删除的节点的前驱节点，dieNode为要删除的节点
    //先判断key的前驱节点是否为空，如果是则抛出一个异常
    //不是则将要删除的节点所保存的要删除节点的下一个节点的地址交给要删除节点的上一个节点的next
    //即跳过要删除的那个节点即可
    @Override
    public int delete(int key) {
        Node pre = searchKey(key);
        Node delNode = pre.next;
//        int oldData = delNode.data;
        if(pre ==null){
            throw new UnsupportedOperationException("key不存在");
        }
        pre.next = delNode.next;
        return key;
    }

    //删除所有的key
    //设置一个pre在头结点位置，cur在第一个有效节点位置，从前向后遍历（给头结点起名叫pre，给有效节点第一个起名cur，pre与cur就是两名称）
    //如果cur.data == key,那么此时节点cur即为要删除的节点
    //将cur的next所存的cur下一个节点的地址交给cur的上一个节点pre的next，即可删除
    //之后cur = cur.next,向后移动一位，继续上述步骤
    //如果cur.data != key，那么此时将cur与pre同时后移一步，继续上述步骤。
    //直到cur.next = head
    @Override
    public void deleteAllkey(int key) {
        Node pre = this.head;
        Node cur = this.head.next;
        while(cur != head){
            if (cur.data == key){
                pre.next = cur.next;
                cur =cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
    }

    //取得数据节点长度（头结点不算）
    @Override
    public int getLength() {
        Node cur = this.head.next;
        int count = 0;//计数器
        while (cur != head){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印单链表
    @Override
    public void display() {
        Node cur = this.head.next;
        while(cur != this.head){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //
    @Override
    public void clear() {

//        this.head.next = this.head;

        while(this.head.next != this.head){
            Node cur = this.head.next;
            this.head.next = cur.next;
            cur.next = null;
        }
        this.head = null;
    }

    public Node middleNode(){
        int mid = getLength()/2;
        Node midNode = this.head;
        for (int i = 0; i < mid; i++) {
            midNode = midNode.next;
        }
        return midNode;
    }
}
