import org.junit.Test;

import static org.junit.Assert.*;

public class NC105SearchTest {

    @Test
    public void search() {
        assertEquals(2, NC105Search.search(new int[] {1,2,4,4,5}, 4));
        assertEquals(-1, NC105Search.search(new int[] {1,2,4,4,5}, 3));
        assertEquals(0, NC105Search.search(new int[] {1,1,1,1,1,1}, 1));
    }
}