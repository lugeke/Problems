import ds.TreeNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class NC14ZigzagLevelOrder {

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<TreeNode> level = new ArrayList<>();
        if (root != null) level.add(root);

        boolean reverse = false;
        while (!level.isEmpty()) {
            ArrayList<Integer> levelData = level.stream().map(x -> x.val).collect(toCollection(ArrayList::new));
            if (reverse) Collections.reverse(levelData);
            result.add(levelData);

            level = level.stream()
                    .flatMap(n -> Stream.of(n.left, n.right))
                    .filter(Objects::nonNull)
                    .collect(toCollection(ArrayList::new));
            reverse = !reverse;
        }
        return result;
    }
}
