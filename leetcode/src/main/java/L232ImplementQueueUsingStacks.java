
import java.util.ArrayDeque;
import java.util.Deque;

public class L232ImplementQueueUsingStacks {

    // add to s1, remove from s2
    private Deque<Integer> s1 = new ArrayDeque<>();
    private Deque<Integer> s2 = new ArrayDeque<>();

    /** Initialize your data structure here. */
    public L232ImplementQueueUsingStacks() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s2.isEmpty())
            move(s1, s2);
        return s2.pop();
    }


    private void move(Deque<Integer> from, Deque<Integer> to) {
        while (!from.isEmpty())
            to.push(from.pop());
    }


    /** Get the front element. */
    public int peek() {
        if (s2.isEmpty())
            move(s1, s2);

        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }


}
