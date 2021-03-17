import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class L199BinaryTreeRightSideViewTest {

    @Test
    public void rightSideView() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3, null, 5, null, 4));
        assertEquals(Arrays.asList(1, 3, 4), L199BinaryTreeRightSideView.rightSideView(root));

        root = new TreeNode(Arrays.asList(1, null, 3));
        assertEquals(Arrays.asList(1, 3), L199BinaryTreeRightSideView.rightSideView(root));

        root = null;
        assertEquals(Collections.emptyList(), L199BinaryTreeRightSideView.rightSideView(root));

        root = new TreeNode(Arrays.asList(1, 2, 3, null, 4));
        assertEquals(Arrays.asList(1, 3, 4), L199BinaryTreeRightSideView.rightSideView(root));
    }
}