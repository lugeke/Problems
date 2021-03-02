package chp8;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PermutationsWithDupsTest {

    @Test
    public void permutations() {

        test("a");
        test("aa");
        test("aab");
        test("abb");
        test("abc");
        test("abbbcc");
        test("abcaacbaa");

        test("aabbccd");
    }

    void test(String str) {
        PermutationsWithDupsC p = new PermutationsWithDupsC(str);
        Collection<String> permutations = p.permutations();
        Set<String> set = new HashSet<>(new PermutationsWithoutDups(str).permutations());

        assertEquals(set.size(), permutations.size());
    }

    @Test
    public void permutations1() {
        new PermutationsWithDupsC("aaaaaaaaaaaaaaa").permutations();
    }

}