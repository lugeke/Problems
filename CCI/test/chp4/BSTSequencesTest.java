package chp4;

import ds.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BSTSequencesTest {

    @Test
    public void testSmall() {
        TreeNode root = new TreeNode(new Integer[]{2, 1, 3});
        List<List<Integer>> lists = new BSTSequences().allSequences(root);

        assertEquals(2, lists.size());
    }


    @Test
    public void testBig() {
        TreeNode root = new TreeNode(new Integer[]{5, 3, 8, 2, 4, 7, 9});
        List<List<Integer>> lists = new BSTSequences().allSequences(root);

        assertEquals(80, lists.size());
        assertEquals(80, new BSTSequences1().allSequences(root).size());


    }

}