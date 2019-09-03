package linked_list;

public class Reserve {
    public ListNode reverseList(ListNode head) {
        ListNode fir = new ListNode(-1);
        // 从前到后遍历原链表
        for(ListNode temp = head;temp!=null;temp=temp.next) {
            // 使用头插法插入新链表
            ListNode newNode = new ListNode(temp.val);
            newNode.next = fir.next;
            fir.next = newNode;
        }
        return fir.next;
    }
}

