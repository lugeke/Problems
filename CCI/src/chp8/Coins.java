package chp8;

import java.util.Arrays;

public class Coins {


    public static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        int[][] map = new int[n + 1][denoms.length]; //precomputed vals
        int count = makeChange(n, denoms, 0, map);
        System.out.println(Arrays.deepToString(map));
        return count;
    }

    private static int makeChange(int amount, int[] denoms, int index, int[][] map) {
        if (map[amount][index] > 0) {//retrieve value
            return map[amount][index];
        }

        if (index >= denoms.length - 1) return 1; //one denom remaining
        int denomAmount = denoms[index];
        int ways = 0;
        for (int i = 0; i * denomAmount <= amount; i++) {
            //go to next denom, assuming i coins of denomAmount
            int amountRemaining = amount - i * denomAmount;
            ways += makeChange(amountRemaining, denoms, index + 1, map);
        }
        map[amount][index] = ways;
        return ways;
    }
}
