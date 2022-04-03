import ds.ListNode;

public class L143ReorderList {

    // 利用快慢指针将后半个列表逆转，合并两个链表
    public static void reorderList(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy, fast = dummy;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = L206ReverseLinkedList.reverseList(slow.next);
        slow.next = null;
        merge(dummy.next, fast);
    }

    // 依次从l1和l2中各取一个
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode tail = new ListNode(0, l1);

        while (l1 != null && l2 != null) {
            ListNode p = l1.next, q = l2.next;
            tail.next = l1;
            tail = l1;
            tail.next = l2;
            tail = l2;
            l1 = p;
            l2 = q;
        }

        if (l2 != null) tail.next = l2;

        return tail.next;
    }


}
