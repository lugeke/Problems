import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L101SymmetricTreeTest {

    @Test
    public void isSymmetric1() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertTrue(L101SymmetricTree.isSymmetric(root));
        assertTrue(L101SymmetricTree.isSymmetricIterative(root));
    }

    @Test
    public void isSymmetric2() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertFalse(L101SymmetricTree.isSymmetric(root));
        assertFalse(L101SymmetricTree.isSymmetricIterative(root));
    }
}