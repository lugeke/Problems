import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class L234PalindromeLinkedListTest {

    @Test
    public void isPalindrome1() {
        ListNode n = new ListNode(Arrays.asList(1,2,2,1));
        assertTrue(L234PalindromeLinkedList.isPalindrome(n));
    }

    @Test
    public void isPalindrome2() {
        ListNode n = new ListNode(Arrays.asList(1,2));
        assertFalse(L234PalindromeLinkedList.isPalindrome(n));
    }

    @Test
    public void isPalindrome3() {
        ListNode n = new ListNode(Collections.singletonList(1));
        assertTrue(L234PalindromeLinkedList.isPalindrome(n));
    }

    @Test
    public void isPalindrome4() {
        ListNode n = null;
        assertTrue(L234PalindromeLinkedList.isPalindrome(n));
    }
}