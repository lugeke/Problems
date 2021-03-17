public class L415AddStrings {

    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder result = new StringBuilder(Math.max(i, j) + 1);
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int m = i < 0 ? 0 : num1.charAt(i--) - '0';
            int n = j < 0 ? 0 : num2.charAt(j--) - '0';
            int sum = m + n + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }
        result.append(carry);

        // remove any leading zeros
        int k = result.length() - 1;
        while (k > 0 && result.charAt(k) == '0') k--;
        result.setLength(k + 1);

        return result.reverse().toString();
    }


}
