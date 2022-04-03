import org.junit.Test;

import static org.junit.Assert.*;

public class L42TrappingRainWaterTest {

    @Test
    public void trap1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, L42TrappingRainWater.trap(height));
        assertEquals(6, L42TrappingRainWater.trap1(height));
    }

    @Test
    public void trap2() {
        int[] height = {4, 2, 0, 3, 2, 5};
        assertEquals(9, L42TrappingRainWater.trap(height));
        assertEquals(9, L42TrappingRainWater.trap1(height));
    }
}