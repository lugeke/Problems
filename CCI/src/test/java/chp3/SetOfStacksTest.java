package chp3;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static java.util.stream.Collectors.*;
public class SetOfStacksTest {


    @Test
    public void testStack() {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(toList());

        SetOfStacks<Integer> stacks= new SetOfStacks<>(3);
        list.forEach(stacks::push);

        Collections.reverse(list);
        for (Integer i: list)
            assertEquals(i, stacks.pop());

        assertEquals(0, stacks.size());
    }


    @Test
    public void popAt() {

        SetOfStacks<Integer> stacks= new SetOfStacks<>(2);
        for (int i = 0; i < 10; i++)
            stacks.push(i);

        assertEquals(5, (int) stacks.popAt(2));
        assertEquals(4, (int) stacks.popAt(2));
        assertEquals(7, (int) stacks.popAt(2));
        assertEquals(3, (int) stacks.popAt(1));
    }
}