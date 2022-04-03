import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NC121PermutationTest {

    @Test
    public void permutation1() {
        ArrayList<String> result = NC121Permutation.Permutation("abc");

        assertEquals(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"), result);
    }


    @Test
    public void permutation2() {
        ArrayList<String> result = NC121Permutation.Permutation("aab");

        assertEquals(Arrays.asList("aab", "aba", "baa"), result);
    }
}