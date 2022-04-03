import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class L215KthLargestElementInAnArrayTest {

    private static final String errorFormat = "the %d largest of %s is %d, not %d";

    private static Object[] getData() {
        return $(
                $(new int[]{3, 2, 1, 5, 6, 4},          2, 5),
                $(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4)
        );
    }

    @Test
    @Parameters(method = "getData")
    public void findKthLargest(int[] nums, int k, int ans) {

        for (int i = 0; i < 100; i++) {
            int kthLargest = L215KthLargestElementInAnArray.findKthLargest(nums, k);
            String errMsg = String.format(errorFormat, k, Arrays.toString(nums), ans, kthLargest);
            assertEquals(errMsg, ans, kthLargest);
        }

    }

}