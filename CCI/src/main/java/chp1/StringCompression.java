package chp1;

public class StringCompression {

    public static String compress(String s) {
        if (s.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        char current = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != current) {
                result.append(current);
                result.append(cnt);
                current = s.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        result.append(current);
        result.append(cnt);

        return result.length() < s.length() ?
                result.toString() : s;
    }

    public static String compress1(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if ( i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0;
            }
        }
        return compressed.length() < s.length() ? compressed.toString() : s;
    }
}
