package chp4;

import ds.TreeNode;

public class CheckSubtree {

    boolean isSubtree(TreeNode t1, TreeNode t2) {
        if (isSame(t1, t2)) return true;
        if (t1 != null && isSubtree(t1.left, t2)) return true;
        if (t1 != null && isSubtree(t1.right, t2)) return true;
        return false;
    }

    private boolean isSame(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        if (t1.val != t2.val) return false;

        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
}
