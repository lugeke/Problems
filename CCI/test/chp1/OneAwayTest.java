package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    @Test
    public void isOneEditAway() {
        assertTrue(OneAway.isOneEditAway("pale", "ple"));
        assertTrue(OneAway.isOneEditAway("pales", "pale"));
        assertTrue(OneAway.isOneEditAway("pale", "pales"));
        assertTrue(OneAway.isOneEditAway("pale", "bale"));

        assertFalse(OneAway.isOneEditAway("pale", "bake"));
    }
}