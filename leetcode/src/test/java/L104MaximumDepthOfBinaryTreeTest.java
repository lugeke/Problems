import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class L104MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth1() {
        TreeNode root = new TreeNode(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertEquals(3, L104MaximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    public void maxDepth2() {
        TreeNode root = new TreeNode(Arrays.asList(1,null,2));
        assertEquals(2, L104MaximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    public void maxDepth3() {
        TreeNode root = null;
        assertEquals(0, L104MaximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    public void maxDepth4() {
        TreeNode root = new TreeNode(Arrays.asList(0));
        assertEquals(1, L104MaximumDepthOfBinaryTree.maxDepth(root));
    }
}