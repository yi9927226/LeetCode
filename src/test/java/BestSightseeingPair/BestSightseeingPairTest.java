package BestSightseeingPair;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestSightseeingPairTest {

    @Test
    public void maxScoreSightseeingPair() {
        int[] A = new int[] {8,1,5,2,6};
        BestSightseeingPair bestSightseeingPair = new BestSightseeingPair();
        assertEquals(11, bestSightseeingPair.maxScoreSightseeingPair(A));
    }
    @Test
    public void maxScoreSightseeingPairSecond() {
        int[] A = new int[] {6,3,7,4,7,6,6,4,9};
        BestSightseeingPair bestSightseeingPair = new BestSightseeingPair();
        assertEquals(13, bestSightseeingPair.maxScoreSightseeingPair(A));
    }
}