import ds.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class L113PathSumIITest {

    @Test
    public void pathSum1() {

        TreeNode root = new TreeNode(Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1));

        List<Integer> list = new ArrayList<>();
        root.preOrder(x -> list.add(x.val));
        System.out.println(list);

        assertEquals(
                Arrays.asList(
                        Arrays.asList(5, 4, 11, 2),
                        Arrays.asList(5, 8, 4, 5)), L113PathSumII.pathSum(root, 22));
    }

    @Test
    public void pathSum2() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3));
        assertEquals(
                Collections.emptyList(), L113PathSumII.pathSum(root, 5));
    }

    @Test
    public void pathSum3() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2));
        assertEquals(
                Collections.emptyList(), L113PathSumII.pathSum(root, 0));
    }
}