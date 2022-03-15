import ds.ListNode;

public class O15FindKth2Tail {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k <= 0) return null;

        int n = 0;
        for (ListNode p = head; p != null; p = p.next)
            n++;

        if (n-k < 0) return null;

        ListNode result = head;
        for (int i = 0; i < n-k; i++)
            result = result.next;

        return result;
    }
}
