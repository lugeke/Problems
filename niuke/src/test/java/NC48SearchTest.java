import org.junit.Test;

import static org.junit.Assert.*;

public class NC48SearchTest {

    @Test
    public void search1() {
        int[] a = {1};
        int result = NC48Search.search(a, 0);
        assertEquals(-1, result);
    }

    @Test
    public void search2() {
        int[] a = {3, 1};

        assertEquals(0, NC48Search.search(a, 3));
        assertEquals(1, NC48Search.search(a, 1));
    }


    @Test
    public void search3() {
        int[] a = {6, 7, 0, 1, 2};

        assertEquals(3, NC48Search.search(a, 1));
        assertEquals(0, NC48Search.search(a, 6));
        assertEquals(2, NC48Search.search(a, 0));
        assertEquals(-1, NC48Search.search(a, 8));
        assertEquals(-1, NC48Search.search(a, -1));
    }

    @Test
    public void search4() {
        int[] a = {6, 7, 8, 1, 2};

        assertEquals(3, NC48Search.search(a, 1));
        assertEquals(0, NC48Search.search(a, 6));
        assertEquals(-1, NC48Search.search(a, 0));
        assertEquals(-1, NC48Search.search(a, 9));
    }


}