import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class L315CountofSmallerNumbersAfterSelfTest {

    @Parameterized.Parameters
    public static int[][][] data() {
        return new int[][][]
                {{{5,2,6,1}, {2,1,1,0}}}
        ;
    }

    private final int[] nums;
    private int[] count;

    public L315CountofSmallerNumbersAfterSelfTest(int[] nums, int[] count) {
        this.nums = nums;
        this.count = count;
    }


    @Test
    public void countSmaller() {

        int[] result = new L315CountofSmallerNumbersAfterSelf().countSmaller(nums)
                .stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(result, count);
    }
}