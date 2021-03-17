import ds.ListNode;

public class L92ReverseLinkedListII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 先走left-1步找到头的上一个节点
        ListNode h = dummy;
        for (int i = 0; i < left - 1; i++) {
            h = h.next;
        }
        // 再走right-left+1步，找到尾巴
        ListNode t = h;
        for (int i = 0; i < right - left + 1; i++) {
            t = t.next;
        }

        ListNode next = t.next;
        t.next = null;

        ListNode oldHead = h.next;
        // reverse left到right的节点
        h.next = L206ReverseLinkedList.reverseList(h.next);

        oldHead.next = next;

        return dummy.next;
    }

}
