package chp2;

import ds.ListNode;

public class ReturnKth2Last {

    public static ListNode kth2Last(ListNode head, int k) {
        if (head == null) return null;
        ListNode p = head, q = head;

        for(int i = 0; i < k-1; i++) {
            q = q.next;
            if (q == null) return null;
        }

        while (q.next != null) {
            q = q.next;
            p = p.next;
        }

        return p;
    }
}
