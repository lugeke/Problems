package ds;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack<U> {
    private Deque<U> deque = new ArrayDeque<>();

    public void push(U item) {
        deque.addLast(item);
    }

    public U pop() {
        return deque.removeLast();
    }

    public U peek() {
        return deque.peekLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }
}
