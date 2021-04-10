import java.util.concurrent.ThreadLocalRandom;
import static ds.Utils.swap;

public class L215KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {

        return kthLargest(nums, 0, nums.length - 1, k - 1);
    }

    private static int kthLargest(int[] nums, int start, int end, int k) {
        // start 到 end 之间选取一个随机数
        int random = ThreadLocalRandom.current().nextInt(start, end + 1);
        swap(nums, start, random);
        int pivot = nums[random];
        // 将比pivot大的放到 pivot 的左边
        // invariant
        // nums[start+1 ... index]    > pivot

        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > pivot) {
                swap(nums, i, ++index);
            }
        }
        swap(nums, index, start);

        int ith = index - start;
        if (ith == k) return pivot;
        else if (k < ith) return kthLargest(nums, start, index - 1, k);
        else return kthLargest(nums, index + 1, end, k - (ith + 1));
    }

}
