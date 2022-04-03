import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L543DiameterOfBinaryTreeTest {

    @Test
    public void diameterOfBinaryTree1() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3, 4, 5));
        int diameter = new L543DiameterOfBinaryTree().diameterOfBinaryTree(root);
        assertEquals(3, diameter);
    }

    @Test
    public void diameterOfBinaryTree2() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2));
        int diameter = new L543DiameterOfBinaryTree().diameterOfBinaryTree(root);
        assertEquals(1, diameter);
    }
}