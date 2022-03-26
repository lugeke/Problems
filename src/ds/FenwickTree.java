package ds;

public class FenwickTree {
    private final int[] sums;

    public FenwickTree(int n) {
        sums = new int[n+1];
    }

    public void update(int i, int delta) {
        for(;i < sums.length; i += lowbit(i))
            sums[i] += delta;
    }

    public int query(int i) {
        int sum = 0;
        for(; i > 0; i -= lowbit(i))
            sum += sums[i];
        return sum;
    }

    private static int lowbit(int x) {
        return x & (-x);
    }
}
