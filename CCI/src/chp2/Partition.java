package chp2;

import ds.ListNode;

public class Partition {
    public static ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead, h = null;
        for (ListNode p = head; p != null; p = p.next) {
            if (p.val < x) {
                tail.next = new ListNode(p.val);
                tail = tail.next;
            } else {
                h = new ListNode(p.val, h);
            }
        }

        tail.next = h;
        return dummyHead.next;
    }
}
