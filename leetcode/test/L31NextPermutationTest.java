import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class L31NextPermutationTest {


    @Test
    public void nextPermutation1() {
        int[] nums = {1, 2, 3};
        L31NextPermutation.nextPermutation(nums);
        int[] result = {1, 3, 2};
        assertArrayEquals(result, nums);
    }

    @Test
    public void nextPermutation2() {
        int[] nums = {3, 2, 1};
        L31NextPermutation.nextPermutation(nums);
        int[] result = {1, 2, 3};
        assertArrayEquals(result, nums);
    }

    @Test
    public void nextPermutation3() {
        int[] nums = {1, 1, 5};
        L31NextPermutation.nextPermutation(nums);
        int[] result = {1, 5, 1};
        assertArrayEquals(result, nums);
    }

    @Test
    public void nextPermutation4() {
        int[] nums = {1};
        L31NextPermutation.nextPermutation(nums);
        int[] result = {1};
        assertArrayEquals(result, nums);
    }

//    [2,3,1]

    @Test
    public void nextPermutation5() {
        int[] nums = {2, 3, 1};
        L31NextPermutation.nextPermutation(nums);
        int[] result = {3, 1, 2};
        assertArrayEquals(result, nums);
    }

    @Test
    public void nextPermutation6() {
        int[] nums = {1, 2, 3};
        for (int i = 0; i < 10; i++) {
            L31NextPermutation.nextPermutation(nums);
            System.out.println(Arrays.toString(nums));
        }
    }

}