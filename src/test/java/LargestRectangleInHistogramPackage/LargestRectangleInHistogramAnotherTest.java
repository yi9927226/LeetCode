package LargestRectangleInHistogramPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestRectangleInHistogramAnotherTest {

    @Test
    public void Quest1() {
        LargestRectangleInHistogramAnother l = new LargestRectangleInHistogramAnother();
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, l.largestRectangleArea(heights));
    }

    @Test
    public void Quest2() {
        LargestRectangleInHistogramAnother l = new LargestRectangleInHistogramAnother();
        int[] heights = new int[]{2,1,5,6,2,3};
        assertEquals(10, l.largestRectangleArea(heights));
    }

    @Test
    public void Quest3() {
        LargestRectangleInHistogramAnother l = new LargestRectangleInHistogramAnother();
        int[] heights = new int[]{5,5};
        assertEquals(10, l.largestRectangleArea(heights));
    }



}