package arrays;

/**
 * Created by daniel on 6/26/17.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int area = 0;

        int low = 0;
        int high = height.length - 1;

        while (low < high) {
            int currentArea = (high - low) * Math.min(height[low], height[high]);
            area = Math.max(area, currentArea);

            if (height[low] > height[high])
                low = low + 1;
            else
                high = high - 1;
        }

        return area;
    }
}
