import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class L146LRUCache {

    public L146LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        list = new DBList();
    }

    private int capacity;
    private DBList list;
    private Map<Integer, DBList.Node> map;

    public int get(int key) {

        DBList.Node node = map.get(key);
        if (node == null) return -1;

        list.remove(node);
        list.addHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DBList.Node node = map.get(key);
        if (node == null) {
            node = new DBList.Node(key, value);
            map.put(key, node);
            list.addHead(node);
        } else {
            list.remove(node);
            list.addHead(node);
            node.value = value;
        }

        if (map.size() > capacity) {
            DBList.Node n = list.removeLast();
            map.remove(n.key);
        }
    }

}

class DBList {

    static class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
        }
    }

    private final Node head = new Node();
    private final Node tail = new Node();

    DBList() {
        head.next = tail;
        tail.pre = head;
    }

    void addHead(Node node) {
        node.next = head.next;
        node.next.pre = node;
        head.next = node;
        node.pre = head;
    }

    Node remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        return node;
    }

    Node removeLast() {
        if (head.next == tail) return null;
        return remove(tail.pre);
    }
}


// 继承LinkedHashMap，重写removeEldestEntry策略
class LRUCache extends LinkedHashMap<Integer, Integer> {

    private int cache_capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.cache_capacity = capacity;
    }

    @Override
    public Integer get(Object key) {
        return super.get(key) == null ? -1 : super.get(key);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > cache_capacity;
    }
}