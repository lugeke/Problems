import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L24SwapNodesInPairsTest {

    @Test
    public void swapPairs1() {
        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4));
        ListNode result = L24SwapNodesInPairs.swapPairs(l);

        assertEquals(Arrays.asList(2, 1, 4, 3), result.toList());
    }

    @Test
    public void swapPairs2() {
        ListNode l = null;
        ListNode result = L24SwapNodesInPairs.swapPairs(l);

        assertNull(result);
    }

    @Test
    public void swapPairs3() {
        ListNode l = new ListNode(Arrays.asList(1));
        ListNode result = L24SwapNodesInPairs.swapPairs(l);

        assertEquals(Arrays.asList(1), result.toList());
    }

    @Test
    public void swapPairs4() {
        ListNode l = new ListNode(Arrays.asList(1, 2, 3));
        ListNode result = L24SwapNodesInPairs.swapPairs(l);

        assertEquals(Arrays.asList(2, 1, 3), result.toList());
    }
}