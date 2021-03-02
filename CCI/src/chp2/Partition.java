package chp2;

import ds.ListNode;

public class Partition {
    public static ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead, h = null;
        for (ListNode p = head; p != null; p = p.next) {
            if (p.data < x) {
                tail.next = new ListNode(p.data);
                tail = tail.next;
            } else {
                h = new ListNode(p.data, h);
            }
        }

        tail.next = h;
        return dummyHead.next;
    }
}
