package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IntersectionTest {

    @Test
    public void intersection() {
        ListNode a = new ListNode(Arrays.asList(1,2,3,4));

        ListNode b = new ListNode(10, a);

        assertEquals(a, Intersection.intersection(a, b));
        assertEquals(a, Intersection.intersection(b, a));


        b = new ListNode(10, a.next.next);

        assertEquals(a.next.next, Intersection.intersection(a, b));
        assertEquals(a.next.next, Intersection.intersection(b, a));
    }

    @Test
    public void intersectionNull() {
        ListNode a = new ListNode(Arrays.asList(1,2,3,4));

        ListNode b = new ListNode(Arrays.asList(1,2,3,4));

        assertNull(Intersection.intersection(a, b));

    }
}