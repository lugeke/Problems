import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L98ValidateBinarySearchTreeTest {

    @Test
    public void isValidBST1() {

        TreeNode root = new TreeNode(Arrays.asList(2, 1, 3));
        boolean validBST = new L98ValidateBinarySearchTree().isValidBST(root);
        assertTrue(validBST);
    }

    @Test
    public void isValidBST2() {

        TreeNode root = new TreeNode(Arrays.asList(5, 1, 4, null, null, 3, 6));
        boolean validBST = new L98ValidateBinarySearchTree().isValidBST(root);
        assertFalse(validBST);
    }
}