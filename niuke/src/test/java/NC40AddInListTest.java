import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NC40AddInListTest {

    @Test
    public void addInList() {

        //[9,3,7],[6,3]
        ListNode h1 = new ListNode(Arrays.asList(9, 3, 7));
        ListNode h2 = new ListNode(Arrays.asList(6, 3));
        ListNode sum = NC40AddInList.addInList(h1, h2);

        assertEquals(Arrays.asList(1, 0, 0, 0), sum.toList());
    }


}