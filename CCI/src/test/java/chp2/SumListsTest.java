package chp2;

import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumListsTest {

    @Test
    public void sum() {
        ListNode a = new ListNode(Arrays.asList(7, 1, 6));
        ListNode b = new ListNode(Arrays.asList(5, 9, 2));

        assertEquals(Arrays.asList(2,1,9), SumLists.sum(a, b).toList());
        assertEquals(Arrays.asList(1,3,0,8), SumLists.sumForward(a, b).toList());

    }

    @Test
    public void sumSingle() {
        ListNode a = new ListNode(Arrays.asList(7));
        ListNode b = new ListNode(Arrays.asList(2));

        assertEquals(Arrays.asList(9), SumLists.sum(a, b).toList());
        assertEquals(Arrays.asList(9), SumLists.sumForward(a, b).toList());
    }

    @Test
    public void sumSingleCarry() {
        ListNode a = new ListNode(Arrays.asList(7));
        ListNode b = new ListNode(Arrays.asList(5));

        assertEquals(Arrays.asList(2,1), SumLists.sum(a, b).toList());
        assertEquals(Arrays.asList(1,2), SumLists.sumForward(a, b).toList());
    }

    @Test
    public void sumNotEven() {
        ListNode a = new ListNode(Arrays.asList(7, 1, 6));
        ListNode b = new ListNode(Arrays.asList(5, 9));

        assertEquals(Arrays.asList(2,1,7), SumLists.sum(a, b).toList());
        assertEquals(Arrays.asList(7,7,5), SumLists.sumForward(a, b).toList());
    }


    @Test
    public void sumNotEven1() {
        ListNode a = new ListNode(Arrays.asList(7, 1, 6));
        ListNode b = new ListNode(Arrays.asList(5, 9));

        assertEquals(Arrays.asList(2,1,7), SumLists.sum(b, a).toList());
        assertEquals(Arrays.asList(7,7,5), SumLists.sumForward(a, b).toList());
    }


}