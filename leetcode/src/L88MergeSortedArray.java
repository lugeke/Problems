public class L88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m - 1, j = n - 1, k = m + n - 1; k >= 0; k--) {
            int max;
            if (i < 0)
                max = nums2[j--];
            else if (j < 0)
                max = nums1[i--];
            else if (nums1[i] >= nums2[j])
                max = nums1[i--];
            else
                max = nums2[j--];
            nums1[k] = max;
        }
    }


}
