package chp3;

import ds.Stack;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

public class SortStackTest {

    @Test
    public void sort() {

        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(toList());

        for (int i = 0; i < 10; i++) {

            Collections.shuffle(list);
            Stack<Integer> stack = new Stack<>();
            System.out.println(list);
            list.forEach(stack::push);
            stack = new SortStack<>(stack).sorted();

            for (int j = 1; j <= 10; j++)
                assertEquals(j, (int) stack.pop());
        }
    }
}