package chp8;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveMultiplyTest {

    @Test
    public void multiply() {


        int a = 1, b = 100;
        assertEquals(a * b, RecursiveMultiply.multiply(a, b));


        a = 817;
        b = 89;
        assertEquals(a * b, RecursiveMultiply.multiply(a, b));

        a = 13;
        b = 476;
        assertEquals(a * b, RecursiveMultiply.multiply(a, b));

        a = 254;
        b = 77;
        assertEquals(a * b, RecursiveMultiply.multiply(a, b));

        a = 54;
        b = 174;
        assertEquals(a * b, RecursiveMultiply.multiply(a, b));

    }
}