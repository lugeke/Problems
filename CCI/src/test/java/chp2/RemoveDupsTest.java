package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDupsTest {

    @Test
    public void removeDups() {

        ListNode node = new ListNode(Arrays.asList(1,1,2));
        RemoveDups.removeDups(node);
        assertEquals(Arrays.asList(1,2), node.toList());

        node = new ListNode(Arrays.asList(1,2,3));
        RemoveDups.removeDups(node);
        assertEquals(Arrays.asList(1,2,3), node.toList());

        node = new ListNode(Arrays.asList(1,1));
        RemoveDups.removeDups(node);
        assertEquals(Arrays.asList(1), node.toList());

        node = new ListNode(Arrays.asList(1,1,1));
        RemoveDups.removeDups(node);
        assertEquals(Arrays.asList(1), node.toList());

        node = new ListNode(Arrays.asList(1,2,1));
        RemoveDups.removeDups(node);
        assertEquals(Arrays.asList(1,2), node.toList());
    }
}