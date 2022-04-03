package chp2;

import ds.ListNode;

public class SumLists {


    // The digits are stored in reverse order
    public static ListNode sum(ListNode a, ListNode b) {
        ListNode i = a, j = b;
        int carry = 0;
        ListNode head = new ListNode(0), tail = head;
        while (i != null || j != null) {
            int sum = (i != null ? i.val : 0)
                    + (j != null ? j.val : 0)
                    + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            if (i != null) i = i.next;
            if (j != null) j = j.next;
        }

        if (carry == 1) tail.next = new ListNode(1);

        return head.next;
    }


    // digits are stored in forward order

    public static ListNode sumForward(ListNode a, ListNode b) {

        ListNode reverseA = a.reverse();
        ListNode reverseB = b.reverse();
        return sum(reverseA, reverseB).reverse();
    }

}
