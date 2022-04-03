import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class L94BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 5, 3, 4, 6, 7));
        List<Integer> list = L94BinaryTreeInorderTraversal.inorderTraversal(root);
        assertEquals(Arrays.asList(3,2,4,1,6,5,7), list);
    }
}