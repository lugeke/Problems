package chp2;
import ds.ListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    public static void removeDups(ListNode node) {
        if (node == null) return;
        Set<Integer> set = new HashSet<>();
        set.add(node.val);

        for(ListNode current = node, next= current.next; next != null; next = next.next) {
            if (set.contains(next.val)) {
                current.next = next.next;
            } else {
                current = next;
                set.add(current.val);
            }
        }
    }
}
