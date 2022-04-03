import org.junit.Test;

import static org.junit.Assert.*;

public class L169MajorityElementTest {

    @Test
    public void majorityElement1() {

        int[] nums = {3, 2, 3};
        int majorityElement = L169MajorityElement.majorityElement(nums);
        assertEquals(3, majorityElement);
    }

    @Test
    public void majorityElement2() {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = L169MajorityElement.majorityElement(nums);
        assertEquals(2, majorityElement);
    }

    @Test
    public void majorityElement3() {

        int[] nums = {2};
        int majorityElement = L169MajorityElement.majorityElement(nums);
        assertEquals(2, majorityElement);
    }
}