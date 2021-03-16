import java.util.HashMap;
import java.util.Map;

public class L3LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        if (c.length <= 1) return c.length;
        int max = 1, start = 0;
        // Invariant start..<end 之间元素不重复
        for (int end = 1; end < s.length(); end++) {
            for (int i = start; i < end; i++) {
                if (c[i] == c[end]) {
                    start = i + 1;
                    break;
                }
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

    // 同NC41
    public static int maxLengthMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int start = 0, end = 0; end < arr.length; end++) {

            Integer i = map.get(arr[end]);
            if (i != null) {
                //重复了
                start = Math.max(start, i + 1);
                //注意：这里一定要取最大的start，不然就错误了
                //为什么？ 因为重复数字的索引很可能比start小
            }
            max = Math.max(max, end - start + 1);
            map.put(arr[end], end);
        }

        return max;
    }


}
