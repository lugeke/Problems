public class L69SqrtX {

    public int mySqrt(int x) {
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

}
