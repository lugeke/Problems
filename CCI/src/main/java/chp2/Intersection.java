package chp2;

import ds.ListNode;

public class Intersection {


    public static ListNode intersection(ListNode a, ListNode b) {
        int lenA = a.getLength();
        int lenB = b.getLength();

        // p.length <= q.length
        ListNode p = a, q = b;
        if (lenA > lenB) {
            p = b;
            q = a;
        }

        for (int i = 0; i < Math.abs(lenA-lenB); i++)
            q = q.next;


        while (p != null && q != null) {
            if (p == q) return p;
            p = p.next;
            q = q.next;
        }

        return null;
    }
}
