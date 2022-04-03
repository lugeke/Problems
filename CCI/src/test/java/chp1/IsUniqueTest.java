package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void isUnique() {

        assertTrue(IsUnique.isUnique("abc"));
        assertTrue(IsUnique.isUnique(""));

        assertFalse(IsUnique.isUnique("aa"));
        assertFalse(IsUnique.isUnique("aba"));
    }

    @Test
    public void isUnique1() {
        assertTrue(IsUnique.isUnique1("abc"));
        assertTrue(IsUnique.isUnique1(""));

        assertFalse(IsUnique.isUnique1("aa"));
        assertFalse(IsUnique.isUnique1("aba"));
    }
}