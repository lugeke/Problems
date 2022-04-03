import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NC53RemoveNthFromEndTest {

    @Test
    public void removeNthFromEnd() {

        ListNode head = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        head = NC53RemoveNthFromEnd.removeNthFromEnd(head, 2);

        assertEquals(Arrays.asList(1, 2, 3, 5), head.toList());
    }

    @Test
    public void removeNthFromEnd1() {

        ListNode head = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        head = NC53RemoveNthFromEnd.removeNthFromEnd(head, 1);

        assertEquals(Arrays.asList(1, 2, 3, 4), head.toList());
    }

    @Test
    public void removeNthFromEnd2() {

        ListNode head = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        head = NC53RemoveNthFromEnd.removeNthFromEnd(head, 5);

        assertEquals(Arrays.asList(2, 3, 4, 5), head.toList());
    }
}