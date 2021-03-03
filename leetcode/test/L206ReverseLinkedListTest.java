import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class L206ReverseLinkedListTest {

    @Test
    public void reverseList() {

        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        l = L206ReverseLinkedList.reverseList(l);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), l.toList());
    }

    @Test
    public void reverseListNull() {
        ListNode l = null;

        l = L206ReverseLinkedList.reverseList(l);;
        assertNull(l);
    }

    @Test
    public void reverseListOne() {
        ListNode l = new ListNode(Collections.singletonList(1));

        l = L206ReverseLinkedList.reverseList(l);;
        assertEquals(Collections.singletonList(1), l.toList());
    }
}