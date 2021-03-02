package chp4;

import ds.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSubtreeTest {


    @Test
    public void testIsSubtree() {
        TreeNode t1 = new TreeNode(new Integer[] {3,4,5,1,2});
        TreeNode t2 = new TreeNode(new Integer[] {4,1,2});

        assertTrue(new CheckSubtree().isSubtree(t1, t2));

        t1 = new TreeNode(new Integer[] {3,4,5,1,2,null,null,null,null,0});
        assertFalse(new CheckSubtree().isSubtree(t1, t2));
    }

}