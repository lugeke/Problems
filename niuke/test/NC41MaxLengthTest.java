import org.junit.Test;

import static org.junit.Assert.*;

public class NC41MaxLengthTest {

    @Test
    public void maxLength() {
        int[] ary = {2, 3, 4, 6, 5, 5, 6, 7, 8, 9, 2, 3, 4};
        assertEquals(8, NC41MaxLength.maxLength(ary));
        assertEquals(8, NC41MaxLength.maxLengthMap(ary));
    }

    @Test
    public void maxLength1() {
        int[] ary = {2, 2, 3, 4, 3};
        assertEquals(3, NC41MaxLength.maxLength(ary));
        assertEquals(3, NC41MaxLength.maxLengthMap(ary));
    }


    @Test
    public void maxLength2() {
        int[] ary = {2, 3, 4, 5};
        assertEquals(4, NC41MaxLength.maxLength(ary));
        assertEquals(4, NC41MaxLength.maxLengthMap(ary));
    }

    @Test
    public void maxLength3() {
        int[] ary = {3, 2, 1, 2, 2, 3, 3};
        assertEquals(3, NC41MaxLength.maxLength(ary));
        assertEquals(3, NC41MaxLength.maxLengthMap(ary));
    }
}