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

        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < 100; i++) {
            TreeNode root = new TreeNode(Arrays.asList(5, 3, 8, 2, 4, 7, 9));

            long start = System.nanoTime();
            List<List<Integer>> lists = new BSTSequences().allSequences(root);
            long t1 = System.nanoTime() - start;
            sum1 += t1;

            start = System.nanoTime();
            ArrayList<LinkedList<Integer>> linkedLists =  new BSTSequences1().allSequences(root);
            long t2 = System.nanoTime() - start;
            sum2 += t2;

            assertEquals(new HashSet<>(lists), new HashSet<>(linkedLists));
        }

        System.out.println(sum1 / sum2);

    }

}