import ds.ListNode;

public class NC53RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode fast = dummy;
        // fast 先走n步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
            if (fast == null) return head;
        }

        ListNode slow = dummy;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
