import java.util.*;

public class L93RestoreIPAddresses {

    public static List<String> restoreIpAddresses(String s) {

        List<String> list = new ArrayList<>();
        dfs(s.toCharArray(), 0, new ArrayDeque<>(), list);
        return list;
    }

    private static void dfs(char[] s, int start, Deque<String> address, List<String> list) {

        if (address.size() == 4) {
            if (start == s.length) list.add(String.join(".", address));
            else return;
        }


        for (int i = 1; i < 4 && (start + i <= s.length); i++) {
            String section = new String(s, start, i);
            // 判断在0到255之间，
            if (i > 1 && section.charAt(0) == '0') break;
            if (Integer.parseInt(section) > 255) break;
            address.addLast(section);

            dfs(s, start + i, address, list);
            address.removeLast();
        }

    }


}
