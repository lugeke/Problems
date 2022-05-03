import ds.ListNode;
import org.junit.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.Assert.assertEquals;

public class O5PrintListReversiblyTest {

    @Test
    public void print() throws Exception {

        String text = tapSystemOut(() -> {
            ListNode head = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
            O5PrintListReversibly.print(head);
        });

        assertEquals("5\n4\n3\n2\n1\n", text);
    }
}