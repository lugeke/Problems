package chp5;

public class Conversion {
    static int countOfBits(int a, int b) {
        int c = a ^ b;
        int i = 1, count = 0;
        while (i != 0) {
            if ((i & c) != 0) count++;
            i <<= 1;
        }
        return count;

    }

    static int bitSwapRequired(int a, int b) {
        int count = 0;
        for (int c = a ^ b; c != 0; c &= (c-1))
            count++;

        return count;
    }
}
