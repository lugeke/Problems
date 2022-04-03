public class L70ClimbingStairs {

    private static int[] stairs = new int[45];

    static {
        stairs[0] = 1;
        stairs[1] = 2;
        for (int i = 2; i < stairs.length; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
    }

    public int climbStairs(int n) {
        return stairs[n - 1];
    }

}
