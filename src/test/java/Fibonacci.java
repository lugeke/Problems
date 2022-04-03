public class Fibonacci {
    static int[] f = new int[100];
    static {
        // 0 1 1 2 3 5 8
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static int compute(int fInput) {
        return f[fInput];
    }
}
