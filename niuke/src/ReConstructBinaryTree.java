import ds.TreeNode;

public class ReConstructBinaryTree {
    private int[] pre;
    private int[] in;

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        this.pre = pre;
        this.in = in;
        return construct(0, pre.length - 1, 0, in.length - 1);
    }

    private TreeNode construct(int pStart, int pEnd, int iStart, int iEnd) {
        if (pStart > pEnd) return null;

        int val = pre[pStart];
        TreeNode root = new TreeNode(val);

        if (pStart == pEnd) return root;

        int rootIndex = iStart;
        for (int i = iStart; i <= iEnd; i++) {
            if (in[i] == val) {
                rootIndex = i;
                break;
            }
        }

        int leftLen = rootIndex - iStart;
        root.left = construct(pStart + 1, pStart + 1 + leftLen - 1, iStart, rootIndex - 1);
        root.right = construct(pStart + leftLen + 1, pEnd, rootIndex + 1, iEnd);

        return root;
    }
}
