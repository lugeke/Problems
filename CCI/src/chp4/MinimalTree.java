package chp4;

import ds.TreeNode;

import java.util.Objects;

public class MinimalTree {

    public static TreeNode minimalTree(int[] ary) {
        Objects.requireNonNull(ary);
        return BST(ary, 0, ary.length-1);
    }

    private static TreeNode BST(int[] ary, int low, int high) {
        if (low > high) return null;
        int mid = low + (high-low) / 2;
        TreeNode root = new TreeNode(ary[mid]);
        root.left = BST(ary, low, mid-1);
        root.right = BST(ary, mid+1, high);
        return root;
    }

}
