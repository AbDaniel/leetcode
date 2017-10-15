package arrays;

/**
 * Created by daniel on 10/13/17.
 */
public class LC42_TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int total = 0;

        maxLeft[0] = height[0];
        for (int i = 1; i < maxLeft.length; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }

        maxRight[height.length - 1] = height[height.length - 1];
        for (int i = maxRight.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }


        for (int i = 1; i < height.length - 1; i++) {
            total += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(trap(nums));
    }
}
