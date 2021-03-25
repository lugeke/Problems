import ds.ListNode;

public class L83RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode tail = head;

        for (ListNode next = head.next; next != null; next = next.next) {
            if (tail.val != next.val) {
                tail.next = next;
                tail = next;
            }
        }

        tail.next = null;
        return head;
    }

}
