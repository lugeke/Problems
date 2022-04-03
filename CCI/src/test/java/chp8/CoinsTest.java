package chp8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinsTest {

    @Test
    public void makeChange() {
        assertEquals(242, Coins.makeChange(100));
    }


}