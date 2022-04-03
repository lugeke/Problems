import org.junit.Test;

import static org.junit.Assert.*;

public class NC91LISTest {

    @Test
    public void LIS() {
        int[] result = {3, 6, 9};
        int[] num = {4, 3, 7, 6, 10, 9};
        assertArrayEquals(result, NC91LIS.LIS(num));
    }

    @Test
    public void LIS1() {
        int[] result = {1, 3, 4, 8, 9};
        int[] num = {2, 1, 5, 3, 6, 4, 8, 9, 7};
        assertArrayEquals(result, NC91LIS.LIS(num));
    }

    @Test
    public void LIS2() {
        int[] result = {1, 2, 4};
        int[] num = {1, 2, 8, 6, 4};
        assertArrayEquals(result, NC91LIS.LIS(num));
    }

    @Test
    public void LIS3() {
        int[] result = {1, 2, 4};
        int[] num = {1, 2, -1, 8, 6, 4};
        assertArrayEquals(result, NC91LIS.LIS(num));
    }
}