package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LoopDetectionTest {

    @Test
    public void detection() {
        ListNode h = new ListNode(Arrays.asList(1,2,3,4,5,6));

        assertNull(LoopDetection.detection(h));
        assertNull(LoopDetection.FindBeginning(h));

        h.next.next.next.next.next = h.next.next;
        assertEquals(h.next.next, LoopDetection.detection(h));
        assertEquals(h.next.next, LoopDetection.FindBeginning(h));



    }
}