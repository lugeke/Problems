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
        while (!(s1.isEmpty() || s2.isEmpty())) {
            int sum = s1.pop().val + s2.pop().val + carry;
            carry = sum / 10;
            h = new ListNode(sum % 10, h);
        }

        Deque<ListNode> s = s1.isEmpty() ? s2 : s1;

        while (!s.isEmpty()) {
            int sum = s.pop().val + carry;
            carry = sum / 10;
            h = new ListNode(sum % 10, h);
        }

        if (carry == 1) h = new ListNode(1, h);
        return h;

    }


}
