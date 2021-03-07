import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NC41MaxLength {

    public static int maxLength(int[] arr) {
        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);
        int max = 1;
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            for (; j < arr.length; j++)
                if (!set.add(arr[j])) {
                    max = Math.max(max, set.size());
                    set.remove(arr[i]);
                    break;
                }
            if (max == arr.length - i) break;
        }
        max = Math.max(max, set.size());
        return max;
    }


    public static int maxLengthMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int start = 0, end = 0; end < arr.length; end++) {
            if (map.containsKey(arr[end])) {
                //重复了
                start = Math.max(start, map.get(arr[end]) + 1);
                //注意：这里一定要取最大的start，不然就错误了
                //为什么？ 因为重复数字的索引很可能比start小
            }
            max = Math.max(max, end - start + 1);
            map.put(arr[end], end);
        }

        return max;
    }
}
