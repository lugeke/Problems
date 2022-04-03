package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {

    @Test
    public void isPermutation() {

        assertTrue(CheckPermutation.isPermutation("abc", "bac"));
        assertTrue(CheckPermutation.isPermutation("a", "a"));
        assertTrue(CheckPermutation.isPermutation("", ""));
        assertTrue(CheckPermutation.isPermutation("aa", "aa"));

        assertFalse(CheckPermutation.isPermutation("a", "aa"));
        assertFalse(CheckPermutation.isPermutation("ab", "bb"));


    }
}