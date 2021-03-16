import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class NC121Permutation {

    public static ArrayList<String> Permutation(String str) {

        ArrayList<String> result = new ArrayList<>();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        dfs(map, new StringBuilder(str.length()), result);
        return result;
    }


    private static void dfs(Map<Character, Integer> map, StringBuilder sb, ArrayList<String> result) {
        if (sb.length() == sb.capacity()) {
            result.add(sb.toString());
            return;
        }

        for (Character c: map.keySet()) {
            Integer count = map.get(c);
            if (count > 0) {
                sb.append(c);
                map.put(c, count-1);

                dfs(map, sb, result);

                map.put(c, count);
                sb.setLength(sb.length()-1);
            }
        }
    }



}
