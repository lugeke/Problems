import static ds.QuickSort.partition;

public class L215KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        assert 0 < k && k <= nums.length;
        return kthLargest(nums, 0, nums.length - 1, nums.length-k);
    }

    private static int kthLargest(int[] nums, int low, int high, int k) {
        int i = partition(nums, low, high);
        if (i == k) return nums[i];
        else if (k < i) return kthLargest(nums, low, i - 1, k);
        else return kthLargest(nums, i + 1, high, k);
    }

}
