package ds;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TreeNode {
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }

    // convert a list to binary tree
    // for example, a list of  (1, 2, 2, null, 3, null, 3)
    // can be converted to a tree like
    //           1
    //         /    \
    //       2        2
    //        \        \
    //         3        3
    public TreeNode(List<Integer> list) {
        if (list == null || list.size() == 0) throw new IllegalArgumentException("list size must > 0");
        this.val = list.get(0);

        TreeNode[] treeNodes = list.stream()
                .map(x -> x != null ? new TreeNode(x) : null)
                .toArray(TreeNode[]::new);

        treeNodes[0] = this;
        for (int i = 0; i < list.size() / 2; i++) {
            if (treeNodes[i] != null) {
                treeNodes[i].left = treeNodes[i * 2 + 1];
                if (i * 2 + 2 < list.size())
                    treeNodes[i].right = treeNodes[i * 2 + 2];
            }
        }

    }

    public TreeNode left;
    public TreeNode right;

    public int getHeight() {
        int leftHeight = 0, rightHeight = 0;
        if (left != null) leftHeight = left.getHeight();
        if (right != null) rightHeight = right.getHeight();
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void preOrder(Consumer<TreeNode> c) {
        c.accept(this);
        if (left != null) left.preOrder(c);
        if (right != null) right.preOrder(c);
    }

    public void inOrder(Consumer<TreeNode> c) {
        if (left != null) left.inOrder(c);
        c.accept(this);
        if (right != null) right.inOrder(c);
    }


    // if p.test(this) is false, then return early (like short-circuit)
    public boolean inOrder(Predicate<TreeNode> p) {
        if (left != null) {
            if (!left.inOrder(p)) return false;
        }
        if (!p.test(this)) return false;
        if (right != null) return right.inOrder(p);
        return true;
    }

    public void postOrder(Consumer<TreeNode> c) {
        if (left != null) left.postOrder(c);
        if (right != null) right.postOrder(c);
        c.accept(this);
    }

    public boolean isBST() {
        //return InorderBST.isValidBST(this);
        Holder<Integer> prev = new Holder<>(null);
        return inOrder(node -> {
                    boolean result;
                    if (prev.isNull()) result = true;
                    else result = prev.getObject() < node.val;
//                    if (result)
//                        System.out.println(prev.getObject() + " < " + node.val);
                    prev.setObject(node.val);
                    return result;
                });
    }

    private static class InorderBST {
        private static Integer prev;

        static boolean isValidBST(TreeNode root) {
            prev = null;
            return inorder(root);
        }

        private static boolean inorder(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (!inorder(root.left)) {
                return false;
            }
            if (prev != null && root.val <= prev) {
                return false;
            }
            prev = root.val;
            return inorder(root.right);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
