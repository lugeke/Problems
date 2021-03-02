package chp5;

import java.util.LinkedList;

public class FlipBitToWin {

    static int longest(int num) {
        int i = 1;
        int max = 0, count = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while (i != 0) {

            // ith bit is 1
            if ((i & num) != 0) count++;
            else {
                list.addFirst(count);
                if (list.size() >= 3)
                    max = Math.max(max, list.get(0) + list.get(1) + list.get(2) + 1);
                list.addFirst(0);
                count = 0;
            }
            i <<= 1;

        }

        return max;
    }


    static int flipBit(int a) {
        if (~a == 0) return Integer.SIZE;

        int currentLength = 0;
        int previousLength = 0;
        int maxLength = 1;
        while (a != 0) {
            if ((a & 1) == 1) {
                currentLength++;
            } else {
                previousLength = (a & 2) == 0 ? 0 : currentLength;
                currentLength = 0;
            }

            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            a >>>= 1;
        }

        return maxLength;
    }
}
