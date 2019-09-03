package fwb.collection.List;

/**
 * @program: collection
 * @description: 基于链表的一个动态数组
 * @author: fwb
 * @create: 2019-07-14 18:50
 **/
public class MyArrayBasedOnLinkedList<E> {
    private class Node{
        E data;
        Node next;
        Node prev;

        Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    private int size;
    private Node head;//头
    private Node tail;//尾

    //尾插
    public void add(E data){
        Node node = new Node(data,null,tail);
        //判断链表是否为空
        if (tail == null){
            head = tail = node;
        }
        //将当前链表的尾指针指向新节点
        tail.next = node;
        //再将新的节点设置为新的尾节点
        tail = node;
        size++;
    }
}
