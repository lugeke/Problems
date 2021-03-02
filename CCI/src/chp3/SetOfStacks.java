package chp3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


class SetOfStacks<T> {

    class Stack<U> {
        private List<U> ary;

        Stack() {
            ary = new ArrayList<>(threshold);
        }

        void push(U item) {
            if (ary.size() == threshold) throw new IllegalStateException();
            else {
                ary.add(item);
            }
        }

        boolean isFull() {
            return ary.size() == threshold;
        }

        boolean isEmpty() {
            return ary.isEmpty();
        }

        U pop() {
            if (ary.isEmpty()) throw new EmptyStackException();
            return ary.remove(ary.size()-1);
        }
    }

    private List<Stack<T>> stacks = new ArrayList<>();

    private int threshold;

     SetOfStacks(int threshold) {
        this.threshold = threshold;
    }

    void push(T item) {
        if (stacks.isEmpty() || getLastStack().isFull()) {
            stacks.add(new Stack<>());
        }

        Stack<T> s = getLastStack();
        s.push(item);
    }

    private Stack<T> getLastStack() {
        return stacks.get(stacks.size()-1);
    }

    T pop() {
        if (stacks.isEmpty()) throw new EmptyStackException();
        Stack<T> s = getLastStack();
        T t = s.pop();
        if (s.isEmpty())
            stacks.remove(stacks.size()-1);

        return t;
    }

    int size() {
        return stacks.size();
    }

    T popAt(int index) {
        Stack<T> s = stacks.get(index);
        T t = s.pop();
        if (s.isEmpty())
            stacks.remove(index);

        return t;
    }
}
