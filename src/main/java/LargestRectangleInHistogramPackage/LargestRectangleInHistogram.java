package LargestRectangleInHistogramPackage;

import java.util.Arrays;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int tempMax = 0;
        for (int h = 0; h < heights.length; h ++) {
            int t = heights.length -1;
            while (t > h) {
                tempMax = Math.max(tempMax, getArea(Arrays.copyOfRange(heights, h, t+1)));
                t --;
            }

            tempMax = Math.max(tempMax, heights[t]);
        }

        return tempMax;
    }

    public int getArea(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int height : heights) {
            min = Math.min(min, height);
        }

        return min * heights.length;
    }
}
