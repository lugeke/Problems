public class NC32Sqrt {

    public static int sqrt(int x) {

        int low = 1, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // 处理溢出
            // 等价于 x < mid * mid
            if (x / mid < mid) {
                high = mid - 1;
            } else if (x / (mid + 1) < (mid + 1)) { // 等价于 x < (mid + 1) * (mid + 1)
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }


    public static int sqrtNewton(int x) {

        double g = 1.0;
        while (Math.abs(g*g-x) > 0.0001) {
            g = (g + x/g) / 2;
        }
        return (int) g;
    }
}
