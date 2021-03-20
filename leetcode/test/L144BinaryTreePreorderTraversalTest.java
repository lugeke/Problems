import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class L144BinaryTreePreorderTraversalTest {

    @Test
    public void preorderTraversal1() {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        assertEquals(Arrays.asList(1, 2, 3), L144BinaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    public void preorderTraversal2() {
        TreeNode root = null;
        assertEquals(Collections.emptyList(), L144BinaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    public void preorderTraversal3() {
        TreeNode root = new TreeNode(1);
        assertEquals(Collections.singletonList(1), L144BinaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    public void preorderTraversal4() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2));
        assertEquals(Arrays.asList(1, 2), L144BinaryTreePreorderTraversal.preorderTraversal(root));
    }

    @Test
    public void preorderTraversal5() {
        TreeNode root = new TreeNode(Arrays.asList(1,null, 2));
        assertEquals(Arrays.asList(1, 2), L144BinaryTreePreorderTraversal.preorderTraversal(root));
    }
}