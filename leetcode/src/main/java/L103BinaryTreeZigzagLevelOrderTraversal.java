import ds.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class L103BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        ArrayList<TreeNode> level = new ArrayList<>();
        if (root != null) level.add(root);

        boolean reverse = false;
        while (!level.isEmpty()) {
            ArrayList<Integer> levelData = level.stream().map(x -> x.val).collect(toCollection(ArrayList::new));
            if (reverse) Collections.reverse(levelData);
            result.add(levelData);

            // level = level.stream().flatMap(n -> Stream.of(n.left, n.right)).filter(Objects::nonNull).collect(toCollection(ArrayList::new));
            ArrayList<TreeNode> currentLevel =  new ArrayList<>();
            for (TreeNode n : level) {
                if (n.left != null) currentLevel.add(n.left);
                if (n.right != null) currentLevel.add(n.right);
            }
            level = currentLevel;
            reverse = !reverse;
        }

        return result;
    }


}
