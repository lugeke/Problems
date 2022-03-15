package ds;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {

    public static void sort(int[] ary) {
        sort(ary, 0, ary.length-1);
    }

    private static void sort(int[] ary, int low, int high) {
        if (low >= high) return;
        int i = partition(ary, low, high);
        sort(ary, low, i-1);
        sort(ary, i+1, high);
    }

    private static int partition(int[] ary, int low, int high) {

        // random num between low and high [low, high]
        int r = low + ThreadLocalRandom.current().nextInt(high-low + 1);
        Utils.swap(ary, low, r);

        // invariant
        // ary[ [low, i) ] <= p
        // ary[ [i, j) ] > p
        // ary[ [j, high] ] ? p (not processed)
        int p = ary[low];
        int i = low + 1;
        for (int j = i; j <= high; j++)
            if (ary[j] <= p)
                Utils.swap(ary, j, i++);

        Utils.swap(ary, low, i-1);
        return i-1;
    }
}
