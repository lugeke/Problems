import ds.ListNode;

public class NC66FindFirstCommonNode {

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int m = 0, n = 0;
        for (ListNode node = pHead1; node != null; node = node.next)
            m++;
        for (ListNode node = pHead2; node != null; node = node.next)
            n++;

        // l1是较长的链表，先走 ｜m-n｜ 步
        ListNode l1 = pHead1, l2 = pHead2;
        int k = m - n;
        if (k < 0) {
            l1 = pHead2;
            l2 = pHead1;
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
