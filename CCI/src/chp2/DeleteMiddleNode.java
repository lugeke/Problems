package chp2;

import ds.ListNode;

public class DeleteMiddleNode {

    public static void delete(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
