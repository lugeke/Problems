import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseKGroupTest {

    @Test
    public void reverse1() {
        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4, 5));

        l = new ReverseKGroup().reverse(l);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), l.toList());

    }

    @Test
    public void reverse2() {
        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        ListNode list2 = new ReverseKGroup().reverseKGroup(l, 2);
        assertEquals(Arrays.asList(2, 1, 4, 3, 5), list2.toList());

        l = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        list2 = new ReverseKGroup().reverseKGroup(l, 3);
        assertEquals(Arrays.asList(3, 2, 1, 4, 5), list2.toList());

        l = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        list2 = new ReverseKGroup().reverseKGroup(l, 1);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), list2.toList());

    }
}