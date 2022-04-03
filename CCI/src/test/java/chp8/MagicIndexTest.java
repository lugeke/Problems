package chp8;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagicIndexTest {

    @Test
    public void index() {

        int[] ary = {-3, -2, -1, 0, 4, 10};
        assertEquals(4, MagicIndex.index(ary));
    }

    @Test
    public void index1() {

        int[] ary = {0, 2, 3, 4, 5, 10};
        assertEquals(0, MagicIndex.index(ary));
    }

    @Test
    public void index2() {

        int[] ary = {0, -2, -1, 0, 3, 5};
        assertEquals(5, MagicIndex.index(ary));
    }

    @Test
    public void index3() {

        int[] ary = {0, -2, -1, 0, 3, 4};
        assertEquals(-1, MagicIndex.index(ary));
    }
}