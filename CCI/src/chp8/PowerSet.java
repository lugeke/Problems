package chp8;

import java.util.*;

public class PowerSet {

    static <T> Collection<Set<T>> allSubset(Set<T> set) {
        Queue<Set<T>> queue = new LinkedList<>();
        queue.add(new HashSet<>());
        int count = 1;
        for (T t: set) {
            for (int i = 0; i < count; i++) {

                Set<T> addZero = queue.poll();
                Set<T> addOne = new HashSet<>(addZero);
                addOne.add(t);

                queue.add(addZero);
                queue.add(addOne);

            }
            count <<= 1;
        }

        return queue;
    }
}
