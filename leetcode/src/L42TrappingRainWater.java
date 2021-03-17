
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
        for (int i = 1; i < height.length - 1; i++) {
            sum += Math.max(Math.min(leftMax[i], rightMax[i]) - height[i], 0);
        }
        return sum;
    }


}
