import java.util.Arrays;

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


}
