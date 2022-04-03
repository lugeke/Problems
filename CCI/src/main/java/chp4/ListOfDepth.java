package chp4;

import ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepth {

    static List<LinkedList<TreeNode>> list(TreeNode root) {
        List<LinkedList<TreeNode>> result = new ArrayList<>();

        LinkedList<TreeNode> currentLevel = new LinkedList<>();
        if (root != null) {
            currentLevel.add(root);
        }

        while (!currentLevel.isEmpty()) {
            result.add(currentLevel);
            LinkedList<TreeNode> nextLevel = new LinkedList<>();
            for (TreeNode node : currentLevel) {
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            currentLevel = nextLevel;
        }

        return result;

    }
}
