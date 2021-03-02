package ds;

import chp2.SumLists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void toList() {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        ListNode node = new ListNode(list);

        assertTrue(node.toList().equals(list));

    }


    @Test
    public void reverse() {

        ListNode a = new ListNode(Arrays.asList(1,2,3));
        assertEquals(Arrays.asList(3,2,1), a.reverse().toList());

        a = new ListNode(1);
        assertEquals(Arrays.asList(1), a.reverse().toList());


    }


}