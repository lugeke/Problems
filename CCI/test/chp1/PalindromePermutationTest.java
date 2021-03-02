package chp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {

    @Test
    public void isPalindromePermutation() {
        assertTrue(PalindromePermutation.isPalindromePermutation("Tact coa"));
        assertTrue(PalindromePermutation.isPalindromePermutation(""));
        assertTrue(PalindromePermutation.isPalindromePermutation("a"));
        assertTrue(PalindromePermutation.isPalindromePermutation("Aa"));

        assertFalse(PalindromePermutation.isPalindromePermutation("Tact coaa"));
    }
}