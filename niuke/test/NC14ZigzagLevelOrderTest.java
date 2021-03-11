import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NC14ZigzagLevelOrderTest {

    @Test
    public void zigzagLevelOrder() {

        TreeNode root = new TreeNode(Arrays.asList(3, 9, 20, null, null, 15, 7));

        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(20,9),
                Arrays.asList(15,7)
        );

        assertEquals(result, NC14ZigzagLevelOrder.zigzagLevelOrder(root));
    }
}