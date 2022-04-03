import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L92ReverseLinkedListIITest {

    @Test
    public void reverseBetween1() {
        ListNode list = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        list = L92ReverseLinkedListII.reverseBetween(list, 2, 4);
        assertEquals(Arrays.asList(1, 4, 3, 2, 5), list.toList());
    }

    @Test
    public void reverseBetween2() {
        ListNode list = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        list = L92ReverseLinkedListII.reverseBetween(list, 1, 5);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list.toList());
    }

    @Test
    public void reverseBetween3() {
        ListNode list = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        list = L92ReverseLinkedListII.reverseBetween(list, 1, 2);
        assertEquals(Arrays.asList(2, 1, 3, 4, 5), list.toList());
    }

    @Test
    public void reverseBetween4() {
        ListNode list = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        list = L92ReverseLinkedListII.reverseBetween(list, 3, 5);
        assertEquals(Arrays.asList(1, 2, 5, 4, 3), list.toList());
    }
}