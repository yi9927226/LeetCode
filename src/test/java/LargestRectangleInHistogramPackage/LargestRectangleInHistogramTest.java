package LargestRectangleInHistogramPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestRectangleInHistogramTest {

    @Test
    public void Quest1() {
        LargestRectangleInHistogram l = new LargestRectangleInHistogram();
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(l.largestRectangleArea(heights), 6);
    }

}