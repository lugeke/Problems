import ds.ListNode;

import java.util.Arrays;

public class ReverseKGroup {

    /**
     * @param head ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(), tail = dummy;

        ListNode p = head;

        outer:
        while (p != null) {

            ListNode h = p, q;
            for (int i = 0; i < k - 1; i++) {
                p = p.next;
                if (p == null) {
                    tail.next = h;
                    break outer;
                }
            }

            q = p.next;
            p.next = null;
            tail.next = reverse(h);

            tail = h;
            p = q;
        }

        return dummy.next;
    }


    ListNode reverse(ListNode head) {

        ListNode h = null, p = head;

        while (p != null) {
            ListNode q = p.next;
            p.next = h;
            h = p;
            p = q;
        }

        return h;
    }

}
