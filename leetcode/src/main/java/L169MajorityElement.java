public class L169MajorityElement {

    public static int majorityElement(int[] nums) {
        int n = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == n) count++;
            else {
                if (--count == 0) {
                    n = num;
                    count = 1;
                }
            }
        }

        return n;
    }


}
