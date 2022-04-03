import ds.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ReConstructBinaryTreeTest {

    @org.junit.Test
    public void reConstructBinaryTree() {

        int[] pre = {1, 2, 3, 4, 5, 6, 7};
        int[] in = {3, 2, 4, 1, 6, 5, 7};

        TreeNode root = new ReConstructBinaryTree().reConstructBinaryTree(pre, in);

        List<Integer> preList = new ArrayList<>();
        root.preOrder(node -> {
            preList.add(node.val);
        });

        List<Integer> inList = new ArrayList<>();
        root.inOrder(node -> {
            inList.add(node.val);
        });

        List<Integer> postList = new ArrayList<>();
        root.postOrder(node -> {
            postList.add(node.val);
        });

        assertEquals(toList(pre), preList);
        assertEquals(toList(in), inList);

        assertEquals(toList(new int[]{3, 4, 2, 6, 7, 5, 1}), postList);

    }

    private List<Integer> toList(int[] ary) {
        return Arrays.stream(ary).boxed().collect(Collectors.toList());
    }
}