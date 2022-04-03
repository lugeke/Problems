package chp3;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void testQueue() {

        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(toList());

        MyQueue<Integer> queue= new MyQueue<>();
        list.forEach(queue::add);

        for (Integer i: list) {
            assertEquals(i, queue.peek());
            assertEquals(i, queue.remove());
        }

        assertEquals(0, queue.size());
    }

}