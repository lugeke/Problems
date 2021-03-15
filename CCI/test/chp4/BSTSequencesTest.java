package chp4;

import ds.TreeNode;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BSTSequencesTest {

    @Test
    public void testSmall() {
        TreeNode root = new TreeNode(Arrays.asList(2,1,3));
        List<List<Integer>> lists = new BSTSequences().allSequences(root);
        ArrayList<LinkedList<Integer>> linkedLists =  new BSTSequences1().allSequences(root);

        assertEquals(new HashSet<>(lists), new HashSet<>(linkedLists));
    }


    @Test
    public void testBig() {
        TreeNode root = new TreeNode(Arrays.asList(5, 3, 8, 2, 4, 7, 9));

        long start = System.currentTimeMillis();
        List<List<Integer>> lists = new BSTSequences().allSequences(root);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        ArrayList<LinkedList<Integer>> linkedLists =  new BSTSequences1().allSequences(root);
        System.out.println(System.currentTimeMillis() - start);

        assertEquals(new HashSet<>(lists), new HashSet<>(linkedLists));
    }

}