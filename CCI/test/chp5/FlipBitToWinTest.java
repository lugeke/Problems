package chp5;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlipBitToWinTest {

    @Test
    public void longest() {

        assertEquals(8, FlipBitToWin.longest(1775));
        assertEquals(8, FlipBitToWin.longest(Integer.parseInt("101110111101", 2)));
        assertEquals(3, FlipBitToWin.longest(Integer.parseInt("1010", 2)));
        assertEquals(2, FlipBitToWin.longest(Integer.parseInt("1", 2)));
    }

    @Test
    public void flipBit() {
        assertEquals(8, FlipBitToWin.flipBit(1775));
        assertEquals(8, FlipBitToWin.flipBit(Integer.parseInt("101110111101", 2)));
        assertEquals(3, FlipBitToWin.flipBit(Integer.parseInt("1010", 2)));
        assertEquals(2, FlipBitToWin.flipBit(Integer.parseInt("1", 2)));
    }
}