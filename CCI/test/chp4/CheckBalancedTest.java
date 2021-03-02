package chp4;

import ds.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckBalancedTest {

    @Test
    public void testOneRoot() {
        assertTrue(CheckBalanced.isBalanced(new TreeNode(1)));
    }

    @Test
    public void testBalanced() {
        TreeNode root = new TreeNode(new Integer[] {1,2,3,4});
        assertTrue(CheckBalanced.isBalanced(new TreeNode(1)));
    }

    @Test
    public void testUnBalanced() {
        TreeNode root = new TreeNode(new Integer[] {1,2,null,4});
        assertTrue(CheckBalanced.isBalanced(new TreeNode(1)));
    }

}