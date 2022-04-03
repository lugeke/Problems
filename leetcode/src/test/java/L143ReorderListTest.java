import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L143ReorderListTest {

    @Test
    public void reorderList1() {
        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4));
        L143ReorderList.reorderList(l);

        assertEquals(Arrays.asList(1, 4, 2, 3), l.toList());
    }

    @Test
    public void reorderList2() {
        ListNode l = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        L143ReorderList.reorderList(l);

        assertEquals(Arrays.asList(1, 5, 2, 4, 3), l.toList());
    }
}