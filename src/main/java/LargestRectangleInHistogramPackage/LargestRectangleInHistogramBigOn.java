package LargestRectangleInHistogramPackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogramBigOn {
    public int largestRectangleArea(int[] heights) {
        int ret = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[heights.length + 2];
        for (int i = 0; i < heights.length; ++i) arr[i + 1] = heights[i];
        for (int i = 0; i < arr.length; ++i) {
            while (! stack.isEmpty() && arr[stack.peekLast()] > arr[i]) {
                int height = arr[stack.pollLast()];
                ret = Math.max(ret, (i - stack.peekLast() - 1) * height);
            }
            stack.offerLast(i);
        }
        return ret;
    }

}
