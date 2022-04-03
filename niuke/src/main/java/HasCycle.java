import ds.ListNode;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        for (ListNode p = head; p != null; p = p.next) {
            if (!set.add(p)) return true;
        }

        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null) return false;
        ListNode one = head, two = head;

        while (two.next != null && two.next.next != null) {
            one = one.next;
            two = two.next.next;
            if (one == two) return true;
        }

        return false;
    }


    public static ListNode findCycleEntry(ListNode head) {
        if (head == null) return null;
        ListNode one = head, two = head;

        while (two.next != null && two.next.next != null) {
            one = one.next;
            two = two.next.next;
            if (one == two) { // 有环
                ListNode p = head;
                while (p != one) {
                    p = p.next;
                    one = one.next;
                }
                return p;
            }
        }

        return null;
    }


}
