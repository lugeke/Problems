package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        ListNode h = new ListNode(Arrays.asList(1,2,3,4));
        assertFalse(Palindrome.isPalindrome(h));

        h = new ListNode(Arrays.asList(1,2,2,1));
        assertTrue(Palindrome.isPalindrome(h));

        h = new ListNode(Arrays.asList(1,2,1));
        assertTrue(Palindrome.isPalindrome(h));

        h = new ListNode(Arrays.asList(1));
        assertTrue(Palindrome.isPalindrome(h));
    }
}