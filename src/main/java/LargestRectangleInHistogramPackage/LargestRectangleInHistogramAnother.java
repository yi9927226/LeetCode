package LargestRectangleInHistogramPackage;

public class LargestRectangleInHistogramAnother {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int tempMax = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] == 0) {
                continue;
            }
            tempMax = Math.max(tempMax, getMaxAreaByOneColumnNotZero(i, heights));
        }

        return tempMax;
    }

    public int getMaxAreaByOneColumnNotZero(int no, int[] heights) {
        int left = no;
        while (left >= 0 && heights[left] >= heights[no]) {
            left --;
        }
        int right = no;
        while (right < heights.length && heights[right] >= heights[no]) {
            right ++;
        }
        if (left == right) {
            return heights[no];
        } else {
            return heights[no] * (right - left - 1);
        }
    }
}
