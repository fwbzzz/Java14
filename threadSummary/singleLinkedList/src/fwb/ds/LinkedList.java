package fwb.ds;

//相当于火车，具体的来连接每个节点
public class LinkedList{
    //数组头结点
    private Node head;
    //长度
    private int size;
    private Node cur;

    public LinkedList(Node head, int size) {
        this.head = null;
        this.size = 0;
    }

    //用来保存每个
    //    //    //每个节点类，封装节点的数据，以及下一个地址
    private class Node{
        Object data;
        Node next;
        //两个构造方法
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(Object data) {
            this.data = data;
        }
    }
    //头插法
    public void addFist(Object data){
        //创建新节点存放数据
        Node newNode = new Node(data);
        //将当前节点指向原来节点的头结点
        newNode.next = this.head;
        this.head = newNode;
    }

    //尾插法
    public void addLast(Object data){
        Node newNode = new Node(data);
        newNode.next = this.cur;
        this.cur = newNode;

    }

    //插入一个数据为data的节点在index前
    public void add(int index,Object data){
        //首先判断index是否合法
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index Illegal");
        }
        if (index == 0){
            addFist(data);
        }
        //默认先从头开始
        Node prev = head;
        //向后推index-1步，走完这个循环一定找到index的上一个节点
        for (int i = 0;i < index -1;i++){
            prev = prev.next;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
    public void Display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
