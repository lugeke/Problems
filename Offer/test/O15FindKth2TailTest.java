import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class O15FindKth2TailTest {


    @Test
    public void test() {
        ListNode l = new ListNode(Arrays.asList(1,2,3,4));

        assertEquals(4, O15FindKth2Tail.getKthFromEnd(l, 1).val);
        assertEquals(3, O15FindKth2Tail.getKthFromEnd(l, 2).val);
        assertEquals(2, O15FindKth2Tail.getKthFromEnd(l, 3).val);
        assertEquals(1, O15FindKth2Tail.getKthFromEnd(l, 4).val);

        assertNull(O15FindKth2Tail.getKthFromEnd(l, 0));
        assertNull(O15FindKth2Tail.getKthFromEnd(l, -1));
        assertNull(O15FindKth2Tail.getKthFromEnd(l, 5));
    }

}