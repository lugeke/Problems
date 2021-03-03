import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IsSymmetricTest {

    @Test
    public void isSymmetric() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertTrue(IsSymmetric.isSymmetric(root));

        root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3, 5));
        assertFalse(IsSymmetric.isSymmetric(root));

        root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3, null, null, 5, null, null, 5));
        assertTrue(IsSymmetric.isSymmetric(root));
    }

}