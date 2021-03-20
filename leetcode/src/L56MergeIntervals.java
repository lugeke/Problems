import java.util.Arrays;
import java.util.LinkedList;

public class L56MergeIntervals {

    public static int[][] merge(int[][] intervals) {


        // intervals 先按start 排序，然后一个一个合并

        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);

        int[][] result = new int[intervals.length][2];
        int count = 0;
        int[] i = intervals[0];
        for (int j = 1; j < intervals.length; j++) {
            //  区间i和j 相交
            if (intervals[j][0] <= i[1]) {
                i = new int[]{i[0], Math.max(intervals[j][1], i[1])};
            } else {
                result[count++] = i;
                i = intervals[j];
            }
        }

        if (!Arrays.equals(i, result[count == 0 ? 0 : count - 1])) result[count++] = i;

        return Arrays.copyOfRange(result, 0, count);
    }


    // 更简洁的写法
    public static int[][] merge1(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }


}
