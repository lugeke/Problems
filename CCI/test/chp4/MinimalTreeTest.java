package chp4;

import ds.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class MinimalTreeTest {

    @Test
    public void minimalTree() {
        int[] ary = IntStream.rangeClosed(1, 100).toArray();
        TreeNode root = MinimalTree.minimalTree(ary);
        assertEquals((int)Math.ceil(Math.log(ary.length + 1) / Math.log(2)), root.getHeight());

        assertTrue(root.isBST());
        List<Integer> l = new ArrayList<>();
        root.inOrder(x -> l.add(x.val));


        // sorted
        for (int i = 0; i < l.size(); i++)
            assertEquals(i+1, (int) l.get(i));
    }
}