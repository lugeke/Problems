package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReturnKth2LastTest {

    @Test
    public void kth2Last() {

        ListNode head = new ListNode(Arrays.asList(1,2,3,4,5));

        assertEquals(5, ReturnKth2Last.kth2Last(head, 1).val);
        assertEquals(4, ReturnKth2Last.kth2Last(head, 2).val);
        assertEquals(3, ReturnKth2Last.kth2Last(head, 3).val);
        assertEquals(2, ReturnKth2Last.kth2Last(head, 4).val);
        assertEquals(1, ReturnKth2Last.kth2Last(head, 5).val);

        assertNull(ReturnKth2Last.kth2Last(head, 6));
        assertNull(ReturnKth2Last.kth2Last(head, 7));
    }
}