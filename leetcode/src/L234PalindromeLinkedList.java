import ds.ListNode;

public class L234PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();

        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }

        for (int i = 0, j = sb.length()-1; i < j; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) return false;
        }
        return true;
    }


}
