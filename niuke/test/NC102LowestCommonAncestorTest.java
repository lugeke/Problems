import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NC102LowestCommonAncestorTest {

    @Test
    public void lowestCommonAncestor() {

        // [3,5,1,6,2,0,8,#,#,7,4],5,1

        TreeNode root = new TreeNode(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));


        assertEquals(3, NC102LowestCommonAncestor.lowestCommonAncestor(root, 5, 1));
        assertEquals(3, NC102LowestCommonAncestor.lowestCommonAncestor(root, 6, 8));
        assertEquals(5, NC102LowestCommonAncestor.lowestCommonAncestor(root, 6, 4));
        assertEquals(2, NC102LowestCommonAncestor.lowestCommonAncestor(root, 7, 4));
    }
}