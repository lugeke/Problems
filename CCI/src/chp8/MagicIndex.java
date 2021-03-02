package chp8;

public class MagicIndex {

    static int index(int[] ary) {

        int low = 0, high = ary.length-1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (ary[mid] == mid) return mid;
            else if (ary[mid] > mid) high = mid-1;
            else low = mid + 1;
        }

        return -1;
    }



}
