import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L124MaxPathSumTest {

    @Test
    public void maxPathSum1() {

        TreeNode root = new TreeNode(Arrays.asList(2, 1, 3));
        assertEquals(6, new L124MaxPathSum().maxPathSum(root));
    }

    @Test
    public void maxPathSum2() {

        TreeNode root = new TreeNode(Arrays.asList(-10, 9, 20, null, null, 15, 7));
        assertEquals(42, new L124MaxPathSum().maxPathSum(root));
    }
}