package chp5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConversionTest {

    @Test
    public void countOfBits() {

        assertEquals(2, Conversion.countOfBits(29, 15));
        assertEquals(0, Conversion.countOfBits(29, 29));
        assertEquals(1, Conversion.countOfBits(0, 1));
    }

    @Test
    public void bitSwapRequired() {
        assertEquals(2, Conversion.bitSwapRequired(29, 15));
        assertEquals(0, Conversion.bitSwapRequired(29, 29));
        assertEquals(1, Conversion.bitSwapRequired(0, 1));
    }
}