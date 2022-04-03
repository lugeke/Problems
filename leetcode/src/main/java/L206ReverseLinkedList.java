import ds.ListNode;

public class L206ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        // 头插法
        ListNode h = null, p = head;

        while (p != null) {
            ListNode q = p.next;
            p.next = h;
            h = p;
            p = q;
        }

        return h;
    }

}
