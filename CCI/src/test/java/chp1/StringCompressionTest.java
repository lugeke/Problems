package chp1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StringCompressionTest {

    @Test
    public void compress() {

        List<String> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        System.out.println(a.getClass() == b.getClass());

        int[] aa = new int[0];
        long[] bb = new long[0];

        System.out.println(aa.getClass() );
        System.out.println(bb.getClass() );

        assertEquals("", StringCompression.compress(""));
        assertEquals("a", StringCompression.compress("a"));
        assertEquals("aa", StringCompression.compress("aa"));
        assertEquals("a3", StringCompression.compress("aaa"));
        assertEquals("a2b1c5a3", StringCompression.compress("aabcccccaaa"));
    }
}