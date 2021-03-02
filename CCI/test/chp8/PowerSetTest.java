package chp8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PowerSetTest {

    @Test
    public void allSubset1() {

        Collection<Set<Integer>> sets = PowerSet.allSubset(new HashSet<>(Arrays.asList(1, 2, 3)));

        assertEquals(8, sets.size());
    }


    @Test
    public void allSubset2() {

        Collection<Set<Integer>> sets = PowerSet.allSubset(new HashSet<>(Arrays.asList(1, 2, 3, 4)));

        assertEquals(16, sets.size());
    }
}