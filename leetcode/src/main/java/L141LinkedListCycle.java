import ds.ListNode;

public class L141LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode one = head, two = head;

        while (two.next != null && two.next.next != null) {
            one = one.next;
            two = two.next.next;
            if (one == two) return true;
        }
        return false;
    }


}
