package chp3;

import ds.Stack;


public class MyQueue<T> {

    // add to s1, remove from s2
    Stack<T> s1 = new Stack<>();
    Stack<T> s2 = new Stack<>();

    public void add(T item) {

        s1.push(item);
    }


    public T remove() {
        if (s2.isEmpty()) pop();
        return s2.pop();
    }

    public T peek() {
        if (s2.isEmpty()) pop();
        return s2.peek();
    }

    private void pop() {
        while (!s1.isEmpty()) s2.push(s1.pop());
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public int size() {
        return s1.size() + s2.size();
    }
}
