import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HasCycleTest {

    @Test
    public void hasCycle() {

        ListNode l = new ListNode(Arrays.asList(1, 2, 3));
        l.next.next.next = l;

        assertTrue(new HasCycle().hasCycle(l));
    }

    @Test
    public void hasCycle1() {

        ListNode l = new ListNode(Arrays.asList(1, 2, 3));
        l.next.next.next = l;

        assertTrue(new HasCycle().hasCycle1(l));
        assertFalse(new HasCycle().hasCycle1(new ListNode(Arrays.asList(1, 2, 3))));

    }


    @Test
    public void hasCycle3() {

        ListNode l = new ListNode(Arrays.asList(1, 2, 3));
        l.next.next.next = l;

        assertSame(HasCycle.findCycleEntry(l), l);
    }


    @Test
    public void hasCycle4() {

        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4));
        l.next.next.next.next = l.next;

        assertSame(HasCycle.findCycleEntry(l), l.next);
    }

    @Test
    public void hasCycle5() {

        ListNode l = new ListNode(Arrays.asList(1, 2, 3));

        assertNull(HasCycle.findCycleEntry(l));
    }
}