import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L958CheckCompletenessOfABinaryTreeTest {

    @Test
    public void isCompleteTree1() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertTrue(L958CheckCompletenessOfABinaryTree.isCompleteTree(root));
    }

    @Test
    public void isCompleteTree2() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3, 4, 5, null, 7));
        assertFalse(L958CheckCompletenessOfABinaryTree.isCompleteTree(root));
    }


    @Test
    public void isCompleteTree3() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, null, 4, 5));
        assertFalse(L958CheckCompletenessOfABinaryTree.isCompleteTree(root));
    }

    @Test
    public void isCompleteTree4() {
        TreeNode root = new TreeNode(Arrays.asList(1));
        assertTrue(L958CheckCompletenessOfABinaryTree.isCompleteTree(root));
    }
}