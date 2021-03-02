package chp4;

import ds.Node;

public class RouteBetweenNodes {

    public static boolean isConnected(Node a, Node b) {
        return dfs(a, b);
    }

    private static boolean dfs(Node a, Node b) {
        if (a == b) return true;
        if (a == null) return false;
        a.visited = true;
        for (Node n : a.children) {
            if (!n.visited)
                if (dfs(n, b)) return true;

        }
        return false;
    }
}
