import ds.ListNode;

public class L2AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        int carry = 0;
        ListNode p = l1, q = l2;
        ListNode current = dummyHead;
        while (p != null || q != null) {
            int x = 0;
            if (p != null) {
                x = p.val;
                p = p.next;
            }
            int y = 0;
            if (q != null) {
                y = q.val;
                q = q.next;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (carry != 0) {
            current.next = new ListNode(1);
        }

        return dummyHead.next;
    }


}
