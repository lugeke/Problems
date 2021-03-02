package chp2;

import ds.ListNode;

public class Palindrome {

    public static boolean isPalindrome(ListNode head) {
        for (ListNode r = head.reverse(); r != null && head != null; r = r.next, head = head.next) {
            if (r.data != head.data) return false;
        }
        return true;
    }


}
