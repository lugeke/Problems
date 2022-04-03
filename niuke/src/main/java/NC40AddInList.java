import ds.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class NC40AddInList {

    public static ListNode addInList(ListNode head1, ListNode head2) {
        Deque<ListNode> s1 = new ArrayDeque<>();
        Deque<ListNode> s2 = new ArrayDeque<>();

        for (ListNode n = head1; n != null; n = n.next) {
            s1.push(n);
        }
        for (ListNode n = head2; n != null; n = n.next) {
            s2.push(n);
        }

        // 头插法
        int carry = 0;
        ListNode h = null;
        ListNode a , b;
        while ((a = s1.pollFirst())  != null | (b = s2.pollFirst()) != null) {
            int sum = carry;
            if (a != null) sum += a.val;
            if (b != null) sum += b.val;
            carry = sum / 10;
            h = new ListNode(sum % 10, h);
        }

        if (carry == 1) h = new ListNode(1, h);
        return h;
    }


}
