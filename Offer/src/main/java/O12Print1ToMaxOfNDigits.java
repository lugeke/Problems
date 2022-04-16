import java.util.Arrays;

public class O12Print1ToMaxOfNDigits {

    public static void print(int n) {
        if (n < 1) return;
        char[] number = new char[n];
        Arrays.fill(number, '0');
        while (!addOne(number)) {
            printNum(number);
        }

    }

    private static boolean addOne(char[] num) {
        boolean isOverflow = false;
        int carry = 1;
        for (int i = num.length-1; i >= 0; i--) {
            int sum = num[i] - '0' + carry;
            if (sum == 10) {
                if (i == 0) isOverflow = true;
                else {
                    num[i] = '0';
                }
            } else {
                num[i] = (char) (sum + '0');
                break;
            }
        }
        return isOverflow;
    }

    private static void printNum(char[] num) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] != '0') {
                String s = new String(num, i, num.length - i);
                System.out.println(s);
                return;
            }
        }

    }

    public static void main(String[] args) {
        printNum("000123".toCharArray());
        printNum("123".toCharArray());
        char[] number = new char[5];
        printNum(number);

        print(3);
    }
}
