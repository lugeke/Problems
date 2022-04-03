import ds.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class L102BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {

        TreeNode root = new TreeNode(Arrays.asList(3,9,20,null,null,15,7));
        List<List<Integer>> levels = L102BinaryTreeLevelOrderTraversal.levelOrder(root);

        //[[3],[9,20],[15,7]]
        List<List<Integer>> result = new ArrayList<>(3);
        result.add(Arrays.asList(3));
        result.add(Arrays.asList(9, 20));
        result.add(Arrays.asList(15, 7));

        assertEquals(result, levels);

    }

    @Test
    public void levelOrder1() {

        TreeNode root = new TreeNode(Arrays.asList(1));
        List<List<Integer>> levels = L102BinaryTreeLevelOrderTraversal.levelOrder(root);

        //[[1]]
        List<List<Integer>> result = new ArrayList<>(1);
        result.add(Arrays.asList(1));

        assertEquals(result, levels);

    }
}