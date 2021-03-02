package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DeleteMiddleNodeTest {

    @Test
    public void delete() {
        ListNode head = new ListNode(Arrays.asList(1,2,3,4,5));

        DeleteMiddleNode.delete(head.next.next);

        assertEquals(Arrays.asList(1,2,4,5), head.toList());
    }
}