package chp5;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionTest {

    @Test
    public void insert() {

        int n = Integer.parseInt("10000000000", 2);
        int m = Integer.parseInt("10011", 2);

        assertEquals(Integer.parseInt("10001001100", 2), Insertion.insert(n, m, 2, 6));
        assertEquals(Integer.parseInt("10001001100", 2), Insertion.insert1(n, m, 2, 6));
    }
}