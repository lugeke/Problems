import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class O36convertBinarySearchTree2SortedDoublyLinkedListTest {

    @Test
    public void treeToDoublyList1() {

        TreeNode root = new TreeNode(Arrays.asList(4, 2, 5, 1, 3));

        TreeNode list = new O36convertBinarySearchTree2SortedDoublyLinkedList().treeToDoublyList(root);
        for (int i = 0; i < 10; i++) {
            assertEquals(list.val, (i % 5) + 1);
            list = list.right;
        }
    }

    @Test
    public void treeToDoublyList2() {

        TreeNode root = new TreeNode(Arrays.asList(1));

        TreeNode list = new O36convertBinarySearchTree2SortedDoublyLinkedList().treeToDoublyList(root);
        for (int i = 0; i < 10; i++) {
            assertEquals(list.val, (i % 1) + 1);
            list = list.right;
        }
    }

    @Test
    public void treeToDoublyList3() {

        TreeNode root = null;

        TreeNode list = new O36convertBinarySearchTree2SortedDoublyLinkedList().treeToDoublyList(root);
        assertNull(list);
    }
}