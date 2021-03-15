import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class NC54ThreeSumTest {

    @Test
    public void threeSum1() {

        ArrayList<ArrayList<Integer>> result = NC54ThreeSum.threeSum(new int[]{-2, 0, 1, 1, 2});

        assertEquals(new HashSet<>(Arrays.asList(
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1))), new HashSet<>(result));
    }

    @Test
    public void threeSum2() {

        ArrayList<ArrayList<Integer>> result = NC54ThreeSum.threeSum(new int[]{-10, 0, 10, 20, -10, -40});

        assertEquals(new HashSet<>(Arrays.asList(
                Arrays.asList(-10, 0, 10),
                Arrays.asList(-10, -10, 20))), new HashSet<>(result));
    }


}