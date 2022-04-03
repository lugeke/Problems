import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L129SumRoot2LeafNumbersTest {

    @Test
    public void sumNumbers1() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3));
        assertEquals(25, new L129SumRoot2LeafNumbers().sumNumbers(root));
    }

    @Test
    public void sumNumbers2() {
        TreeNode root = null;
        assertEquals(0, new L129SumRoot2LeafNumbers().sumNumbers(root));
    }

    @Test
    public void sumNumbers3() {
        TreeNode root = new TreeNode(Arrays.asList(4, 9, 0, 5, 1));
        assertEquals(1026, new L129SumRoot2LeafNumbers().sumNumbers(root));
    }

    @Test
    public void sumNumbers4() {
        TreeNode root = new TreeNode(Arrays.asList(4, 9, 0, null, 1));
        assertEquals(531, new L129SumRoot2LeafNumbers().sumNumbers(root));
    }

}