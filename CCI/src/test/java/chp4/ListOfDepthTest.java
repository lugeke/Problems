package chp4;

import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

public class ListOfDepthTest {

    @Test
    public void testNull() {
        List<LinkedList<TreeNode>> list = ListOfDepth.list(null);
        assertEquals(0, list.size());
    }

    @Test
    public void testOneLevel() {
        List<LinkedList<TreeNode>> list = ListOfDepth.list(new TreeNode(4));
        assertEquals(1, list.size());
        assertEquals(Arrays.asList(4), list.get(0).stream().map(x -> x.val).collect(toList()));
    }


    @Test
    public void testMultipleLevel() {
        TreeNode root = new TreeNode(Arrays.asList(1, 2, 3, null, null, 4, 5, null, null, null, null, null, null, 6));
        List<LinkedList<TreeNode>> list = ListOfDepth.list(root);

        assertEquals(4, list.size());

        assertEquals(Arrays.asList(1), list.get(0).stream().map(x -> x.val).collect(toList()));
        assertEquals(Arrays.asList(2, 3), list.get(1).stream().map(x -> x.val).collect(toList()));
        assertEquals(Arrays.asList(4, 5), list.get(2).stream().map(x -> x.val).collect(toList()));
        assertEquals(Arrays.asList(6), list.get(3).stream().map(x -> x.val).collect(toList()));

    }

}