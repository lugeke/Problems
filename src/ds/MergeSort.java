package ds;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] ary) {
        temp = new int[ary.length];
        sort(ary, 0, ary.length - 1);
        temp = null;
    }

    private static void sort(int[] ary, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        sort(ary, low, mid);
        sort(ary, mid + 1, high);
        merge(ary, low, mid, high);
    }

    private static int[] temp;

    private static void merge(int[] ary, int low, int mid, int high) {

        System.arraycopy(ary, low, temp, low, high - low + 1);

        for (int k = low, i = low, j = mid+1; k < high+1; k++) {
            if (i > mid) ary[k] = temp[j++];
            else if (j > high) ary[k] = temp[i++];
            else if (temp[i] <= temp[j]) ary[k] = temp[i++];
            else ary[k] = temp[j++];
        }
    }
}
