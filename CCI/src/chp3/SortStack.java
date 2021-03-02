package chp3;

import ds.Stack;

public class SortStack<T extends Comparable<? super T>> {

    Stack<T> stack;

    public SortStack(Stack<T> stack) {
        this.stack = stack;
    }

    public Stack<T> sorted() {
        if (stack.isEmpty()) return new Stack<>();
        Stack<T> sorted = new Stack<>();

        sorted.push(stack.pop());
        while (!stack.isEmpty() ) {
            T t = stack.pop();

            int size = 0;
            while (!sorted.isEmpty() && t.compareTo(sorted.peek()) > 0) {
                stack.push(sorted.pop());
                size++;
            }

            sorted.push(t);

            for (int i =0; i < size; i++)
                sorted.push(stack.pop());
        }

        return sorted;

    }


}
