/*
练习
 */

class Node{
    Object data;
    Node next;
}

public class Test1 {
    public static void main(String[] args) {
        //第一个节点
        Node first = new Node();
        first.data = 1;
        //第二个节点
        Node second = new Node();
        second.data = 2;
        //一连二
        first.next = second;
        //第三个节点
        Node third = new Node();
        third.data = 3;
        //二连三
        second.next = third;
        //遍历
        for(Node temp = first;temp != null;temp = temp.next){
            System.out.println(temp.data + "、");
        }
    }
}


