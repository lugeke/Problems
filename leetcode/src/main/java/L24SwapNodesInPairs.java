import ds.ListNode;

public class L24SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode p = head, q, tail = dummy;

        while (p != null && (q = p.next) != null) {
            ListNode next = q.next;
            tail.next = q;
            q.next = p;
            tail = p;

            p = next;
        }
        tail.next = p;

        return dummy.next;
    }


}
