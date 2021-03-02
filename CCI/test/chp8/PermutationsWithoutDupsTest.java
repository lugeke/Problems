package chp8;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class PermutationsWithoutDupsTest {

    @Test
    public void permutations1() {
        PermutationsWithoutDups p = new PermutationsWithoutDups("abc");
        Collection<String> permutations = p.permutations();
//        System.out.println(permutations);
        assertEquals(6, permutations.size());
    }

    @Test
    public void permutations2() {
        PermutationsWithoutDups p = new PermutationsWithoutDups("a");
        Collection<String> permutations = p.permutations();

        assertEquals(1, permutations.size());
    }

    @Test
    public void permutations3() {
        PermutationsWithoutDups p = new PermutationsWithoutDups("");
        Collection<String> permutations = p.permutations();

        assertEquals(0, permutations.size());
    }
}