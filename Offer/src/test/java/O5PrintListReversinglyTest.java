import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class O5PrintListReversinglyTest {

    @Test
    public void print() {
        ListNode head = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        O5PrintListReversingly.print(head);
    }
}