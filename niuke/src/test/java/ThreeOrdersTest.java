import ds.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ThreeOrdersTest {

    @Test
    public void inOrder() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        int[] inOrder = ThreeOrders.inOrder(root);

        assertArrayEquals(new int[]{3, 2, 4, 1, 4, 2, 3}, inOrder);
    }

    @Test
    public void inOrder1() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, null, null, 3));
        int[] inOrder = ThreeOrders.inOrder(root);

        assertArrayEquals(new int[]{3, 2, 1, 2, 3}, inOrder);
    }

    @Test
    public void inOrder2() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, null, 4, 4, null));
        int[] inOrder = ThreeOrders.inOrder(root);

        assertArrayEquals(new int[]{2, 4, 1, 4, 2}, inOrder);
    }


    @Test
    public void preOrder() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        int[] preOrder = ThreeOrders.preOrder(root);

        assertArrayEquals(new int[]{1, 2, 3, 4, 2, 4, 3}, preOrder);
    }

    @Test
    public void preOrder1() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, null, null, 3));
        int[] preOrder = ThreeOrders.preOrder(root);

        assertArrayEquals(new int[]{1, 2, 3, 2, 3}, preOrder);
    }

    @Test
    public void preOrder2() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, null, 4, 4));
        int[] preOrder = ThreeOrders.preOrder(root);

        assertArrayEquals(new int[]{1, 2, 4, 2, 4}, preOrder);
    }


    @Test
    public void postOrder() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        int[] postOrder = ThreeOrders.postOrder(root);

        assertArrayEquals(new int[]{3, 4, 2, 4, 3, 2, 1}, postOrder);
    }

    @Test
    public void postOrder1() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, 3, null, null, 3));
        int[] postOrder = ThreeOrders.postOrder(root);

//        System.out.println(Arrays.toString(postOrder));
        assertArrayEquals(new int[]{3, 2, 3, 2, 1}, postOrder);
    }

    @Test
    public void postOrder2() {

        TreeNode root = new TreeNode(Arrays.asList(1, 2, 2, null, 4, 4));
        int[] postOrder = ThreeOrders.postOrder(root);

//        System.out.println(Arrays.toString(postOrder));
        assertArrayEquals(new int[]{4, 2, 4, 2, 1}, postOrder);
    }

}