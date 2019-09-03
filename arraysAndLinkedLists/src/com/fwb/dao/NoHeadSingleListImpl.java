package com.fwb.dao;

import com.fwb.impl.ILinked;

/*
不带头单链表
 */

public class NoHeadSingleListImpl implements ILinked {
    public int datal = 10;

    //成员内部类，也叫实例内部类
    public class Node {
        //public 便于写代码，正确写法应该用private保证封装性
        public int data;
        public Node next;
        /*
        扩展1.
        private static final int sa = 10;
        编译期间确定的（需要加final）   
         */
        public int datal = 10;
        /*
        扩展2.
        引用内部的datal可以直接引用（最好加this）
        引用外部的datal需要加外部类名称： NoHeadSingleListImpl.this.datal
         */

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    //head指出头在哪
    private Node head;

    public NoHeadSingleListImpl() {
        this.head = head;
    }

    //头插
    //1.将头结点的地址交给新插入的节点的next
    //2.再将新插入的节点作为新的头结点
    @Override
    public void addFirst(int data) {
        Node newNode = new Node(data);
        //第一次插入数据，其实不用if判断也是可以的
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    //尾插
    //1.将cur放在头结点的位置
    //2.判断是否第一次插入数据，如果是将新的节点设置为头结点即可
    //3.如果不是,那么从头结点向后遍历，找到最后一个节点，将新的节点的地址交给原链表的最后一个节点的next
    @Override
    public void addLast(int data) {
        Node newNode = new Node(data);
        Node cur = this.head;
        //第一次插入数据
        if (cur == null) {
            this.head = newNode;
        } else {
            //从前向后遍历找到next为空的节点0
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }

    //判断index合法性，index不能小于0，不能大于链表长度
    private void checkIndex(int index) {
        if(index < 0 || index > getLength()){
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }

    //找到index上一个位置的节点
    //1.首先判断index是否为0，如果index为0那么index - 1为空
    //2.将pre放在头节点，
    private Node searchIndex(int index) {
        checkIndex(index);
        //如果在头
        if(index == 0){
            return null;
        }
        int count = 0;//记录走的步数
        Node pre = this.head;
        while(pre != null && count < index -1 ){
            pre = pre.next;
            count++;
        }
        return pre;
    }

    //添加到index这个位置
    @Override
    public void addIndex(int index, int data) {
        Node newNode = new Node(data);
        Node lastIndex  = searchIndex(index);
        if (lastIndex ==null){
            newNode.next = this.head;
            this.head = newNode;
        }else{
            //此处将新节点与其后面的节点连接
            newNode.next = lastIndex.next;
            //此处将新节点与其前面的节点连接
            lastIndex.next = newNode;
        }

    }

    //是否包含key
    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找到key所在节点的上一个节点
    //precursor 前驱
    private Node searchPre(int key) {
        //1.判断是不是第一个节点(head.data == key)
        //2.if(cur.next.data == key)
        Node pre = this.head;
        if (pre.data == key){
            return this.head;
            //return null;
        }
        while (pre.next != null){
            if(pre.next.data == key){
                return pre;
            }
            pre = pre.next;
        }
        return null;
    }

    @Override
    public int delete(int key) {
        //或者无需在searchPre中判断，直接
        //if(head.data == key)
        int oldData = 0;//保存将来要删除的这个值
        //pre为通过searchPre()找出来的要删除的节点的上一个值
        //如果要删除的节点为第一个，那么pre直接保存要删除的节点
        Node pre = searchPre(key);
        //第一个节点
        if(pre == this.head && pre.data == key){
            oldData = this.head.data;
            this.head = this.head.next;
            return oldData;
        }
        //未找到
        if (pre == null){
           // return -1;
            throw new UnsupportedOperationException("没有key的前驱");
        }
        //其他节点
        Node delNode = pre.next;
        //将要删除的节点的前一位的next指向要删除的节点的后一位，直接跳过要删除的节点，即可删除
        pre.next = delNode.next;
        return oldData;
    }
    /*
    可以设置一个假的头结点，这样就不用考虑头结点为空的情况了
    Node fakeNode = new Node();
    fakeNode.next = head;
     */

    @Override
    public void deleteAllkey(int key) {
        //pre要删除节点的前一位
        Node pre = this.head;
        //要删除的节点
        Node cur = this.head.next;
        while (cur != null){
            if (cur.data == key){
                //如果确认cur是要删除的节点，则将它的前一位直接指向他的后一位，将其跳过，即可删除
                pre.next = cur.next;
                //cur向后推移
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key){
            this.head = this.head.next;
        }
    }

    //输出节点个数
    @Override
    public int getLength() {
        Node cur = this.head;
        int i = 0;
        while(cur != null){
            cur = cur.next;
            i++;
        }
        return i;
    }

    //防止内存泄漏
    @Override
    public void clear() {
        while(this.head != null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head = cur;
        }
    }

    //打印
    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");
    }

/*
编写代码，以给定值x为基准将链表分割成两部分，所有⼩于x的结点排在⼤于或等于x的结点之前
 */
    public Node partition(int x){
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;
        Node pHead = this.head;
        while(pHead != null){
            //先用pHeadNext记录pHead.next,之后将phead.next置为空，防止内存泄露
            Node pHeadNext = pHead.next;
            pHead.next = null;
            if(pHead.data < x){
                if(beforeStart == null){
                    beforeStart = pHead;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = pHead;
                    beforeEnd = beforeEnd.next;
                }
            }else {
                if (afterStart == null) {
                    afterStart = pHead;
                    afterEnd = afterStart;
                } else {
                    //将pHead插到此时最后一位的下一位
                    afterEnd.next = pHead;
                    //将此时插入过后的最后一位重新设置为afterEnd
                    afterEnd = pHead;
                }
            }
            pHead = pHeadNext;
        }
        //第一段没有数据（单链表的所有数据都比x大）
        if(beforeStart == null){
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public void show(Node newHead){
        Node cur = newHead;
        while(cur != null){
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    /*
    找到倒数第二个数
     */
    public boolean findKthToTail(int k) {
        Node fast = this.head;
        Node slow = this.head;
        if(fast == null || k <= 0 || k > getLength()){
            return false;
        }
        //fast先走k - 1步，（之所以是k - 1，比如说倒数第二个位置，只和最后一位差了1步）
        while(k - 1 > 0){
            fast = fast.next;
            k--;
        }
//        for (int i = 0; i < k - 1; i++) {
//            fast = fast.next;
//        }
        //然后fast，slow一起往后走，直到fast.next为空
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    /*
    单链表的逆置，将链表从前往后遍历一遍，
    把从头结点开始的所有数据都用头插法再插到前面去
    这个函数思想就是设要调换的节点为cur，它前面的节点为prev，他的下一个为curNext
    先用curNext保存cur.next，之后将cur.next设为prev（即指他的上一位），之后再将prev与cur向后遍历
    继续上述步骤
    此代码与思想应该是没啥问题的，但是不知道为什么无法执行，等以后牛逼了再来改错
     */
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node reverseHead = null;
        while(cur != null){
            Node curNext = cur.next;//注：如果cur==null，那么此时会发生空指针异常，所以就很巧
            if(curNext == null){
               reverseHead = cur;
            }//
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return reverseHead;
    }
    /*
    在⼀个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链
表头指针。【022344】-> 【03】
     */
    public Node deleteDuplication() {
        Node newHead = new Node(-1);//是一个虚拟节点将其标记为-1
        Node temHead = newHead;//由于题目中要求返回头结点但是newHead在代码中产生了移动，所以用temHead先保存一下头结点
        Node cur = this.head;
        //cur.next != null 也行，但是此时用cur != null的好处是可以防止head为空
        while(cur != null){
            //因为给定的链表是有序的所以只用判断节点和他的下一个节点是否相等即可
            if (cur.next != null && cur.next != null && cur.data == cur.next.data){
                //此循环针对一直遇到相等的节点
               while (cur.next != null && cur.data == cur.next.data){
                   cur = cur.next;
               }
                cur = cur.next;
                newHead.next = cur;
            }//如果不相等，则将cur交给一个新的链表即可，到时候只用返回新的链表，
             // 此时新链表即为删除过相同元素的链表
            else{
                newHead.next = cur;
                newHead = cur;
                cur = cur.next;
            }
        }
        return temHead.next;
    }
    /*
    链表的回⽂结构。
    定义两个节点，slow与fast，fast走到链表最后位置的时候，slow刚走到链表中间位置，即可找到链表的中间位置。
    之后将链表的后半部分逆置
     */
    public boolean chkPalindrome() {
        //如果链表为空，直接反回true，如果链表只有一个节点，直接返回true
        if (this.head == null){
            return false;
        }else if (this.head.next == null){
            return true;
        }
        Node slow = this.head;
        Node fast = this.head;
        //fast != null防止fast.next == null，fast.next != null防止fast.next.next == null
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        /*
         将后半段链表逆置
         .0定义一个节点p，为slow的下一个节点，p1为p的下一个节点，将p的next指向slow，之后将slow，p，p1向后推移
         最后一步是这样的情景：p1为null，slow = p(此时的p在链表最后一位)，p = p1（在这步走完，p已经为空）
         以上最后一步进行完毕以后，后半段链表逆置。（原slow的位置在尾部，新的slow位置在链表的头。
         */

        Node p = slow.next;
        Node p1 = p.next;
        while (p != null){
            p.next = slow;
            slow = p;
            p = p1;
            if (p1 != null) {
                p1 = p1.next;
            }
        }
        while(slow != this.head) {
            if (slow.data != head.data){
                return false;
            }
            //偶数节点
            if (head.next == slow){
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
