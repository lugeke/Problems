package chp2;

import ds.ListNode;

public class DeleteMiddleNode {

    public static void delete(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
