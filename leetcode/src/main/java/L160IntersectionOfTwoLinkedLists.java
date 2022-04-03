import ds.ListNode;

public class L160IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = 0, n = 0;
        for (ListNode node = headA; node != null; node = node.next)
            m++;
        for (ListNode node = headB; node != null; node = node.next)
            n++;

        // l1是较长的链表，先走 ｜m-n｜ 步
        ListNode l1 = headA, l2 = headB;
        int k = m - n;
        if (k < 0) {
            l1 = headB;
            l2 = headA;
            k = -k;
        }

        for (int i = 0; i < k; i++) {
            l1 = l1.next;
        }

        while (l1 != null && l2 != null) {
            if (l1 == l2) return l1;

            l1 = l1.next;
            l2 = l2.next;
        }

        return null;
    }


}
