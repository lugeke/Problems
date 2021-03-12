import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NC66FindFirstCommonNodeTest {

    @Test
    public void findFirstCommonNode() {

        ListNode l1 = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        ListNode l2 = new ListNode(Arrays.asList(5, 6));
        l2.next.next = l1.next;

        assertSame(l1.next, NC66FindFirstCommonNode.FindFirstCommonNode(l1, l2));
    }

    @Test
    public void findFirstCommonNode1() {

        ListNode l1 = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        ListNode l2 = new ListNode(Arrays.asList(5, 6));


        assertSame(null, NC66FindFirstCommonNode.FindFirstCommonNode(l1, l2));
    }

    @Test
    public void findFirstCommonNode2() {

        ListNode l1 = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        ListNode l2 = l1.next.next;

        assertSame(l1.next.next, NC66FindFirstCommonNode.FindFirstCommonNode(l1, l2));
    }
}