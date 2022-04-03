package chp3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackMinTest {


    @Test
    public void testMinStack() {

        StackMin<Integer> s = new StackMin<Integer>();

        s.push(6);
        assertTrue(6 == s.min());

        s.push(7);
        assertTrue(6 == s.min());

        s.push(5);
        assertTrue(5 == s.min());


        assertTrue(5 == s.pop());
        assertTrue(6 == s.min());
    }

}