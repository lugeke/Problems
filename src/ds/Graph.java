package ds;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public Node[] nodes;


    public static class Node {
        public String name;
        public boolean visited;
        public List<Node> children = new ArrayList<>();
    }
}

