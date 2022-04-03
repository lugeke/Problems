package chp3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class StackMin<T extends Comparable<? super T>> {

    private Deque<T> stack = new ArrayDeque<>();
    private Deque<T> minStack = new ArrayDeque<>();


    public void push(T item) {
        stack.addLast(item);

        if (minStack.isEmpty()) minStack.push(item);
        else {
            T top = minStack.peekLast();
            minStack.addLast(top.compareTo(item) < 0 ? top : item);
        }
    }


    public T pop() {

        if (minStack.isEmpty()) throw new EmptyStackException();
        minStack.pollLast();
        return stack.pollLast();
    }

    public T min() {
        if (minStack.isEmpty()) throw new EmptyStackException();
        return minStack.peekLast();
    }
}
