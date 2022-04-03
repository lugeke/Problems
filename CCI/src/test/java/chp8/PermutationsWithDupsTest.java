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
        PermutationsWithDupsC p1 = new PermutationsWithDupsC(str);
        PermutationsWithDups p2 = new PermutationsWithDups(str);

        Collection<String> permutations1 = p1.permutations();
        Collection<String> permutations2 = p2.permutations();
        Set<String> set = new HashSet<>(new PermutationsWithoutDups(str).permutations());

        assertEquals(set.size(), permutations1.size());
        assertEquals(set.size(), permutations2.size());

        assertEquals(set, new HashSet<>(permutations1));
        assertEquals(set, new HashSet<>(permutations2));

    }

    @Test
    public void permutations1() {
        new PermutationsWithDupsC("aaaaaaaaaaaaaaa").permutations();
    }

}