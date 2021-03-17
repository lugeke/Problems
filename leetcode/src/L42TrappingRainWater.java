
public class L42TrappingRainWater {

    public static int trap(int[] height) {
        int[] leftMax = new int[height.length];
        for (int i = 0, max = -1; i < height.length; i++) {
            leftMax[i] = Math.max(max, height[i]);
            max = leftMax[i];
        }

        int[] rightMax = new int[height.length];
        for (int i = height.length - 1, max = -1; i > -1; i--) {
            rightMax[i] = Math.max(max, height[i]);
            max = rightMax[i];
        }

        int sum = 0;

        // i能装的水量为 左边的最大值和右边的最大值中较小的一个 与 自己的差
        for (int i = 1; i < height.length - 1; i++) {
            sum += Math.max(Math.min(leftMax[i], rightMax[i]) - height[i], 0);
        }
        return sum;
    }


    // 先找到最高的， 然后从两头往中间遍历
    public static int trap1(int[] height) {
        if (height == null || height.length < 3) return 0;
        int maxIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex])
                maxIndex = i;
        }

        int water = 0;
        int peak = 0;
        for (int i = 0; i < maxIndex; i++) {
            int h = height[i];
            if (h > peak) peak = h;
            else water += peak - h;
        }

        peak = 0;
        for (int i = height.length - 1; i > maxIndex; i--) {
            int h = height[i];
            if (h > peak) peak = h;
            else water += peak - h;
        }

        return water;
    }


}
