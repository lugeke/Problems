public class Solve {

    public static String solve (String s, String t) {
        StringBuilder result = new StringBuilder();
        int i = s.length()-1, j = t.length() - 1;


        int carry = 0;
        while (i >= 0 || j >= 0) {
            int m = i < 0 ? 0 : s.charAt(i--) - '0';
            int n = j < 0 ? 0 : t.charAt(j--) - '0';
            int sum = m + n + carry;

            carry = sum / 10;

            result.append(sum % 10);
        }

        if (carry == 1) result.append(1);

        int k = result.length() - 1;
        while (k > 0 && result.charAt(k) == '0') k--;

        result.setLength(k+1);

        return result.reverse().toString();
    }
}
