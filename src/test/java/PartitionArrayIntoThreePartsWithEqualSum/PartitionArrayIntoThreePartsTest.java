package PartitionArrayIntoThreePartsWithEqualSum;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PartitionArrayIntoThreePartsTest {
    @Test
    public void canThreePartsEqualSum() {
        int[] A = new int[] {0,2,1,-6,6,-7,9,1,2,0,1};
        PartitionArrayIntoThreeParts partsWithEqualSum = new PartitionArrayIntoThreeParts();
        assertTrue(partsWithEqualSum.canThreePartsEqualSum(A));
    }

    @Test
    public void canThreePartsEqualSumFalse() {
        int[] A = new int[] {0,2,1,-6,6,7,9,-1,2,0,1};
        PartitionArrayIntoThreeParts partsWithEqualSum = new PartitionArrayIntoThreeParts();
        assertFalse(partsWithEqualSum.canThreePartsEqualSum(A));
    }

    @Test
    public void canThreePartsEqualSumTrue() {
        int[] A = new int[] {18,12,-18,18,-19,-1,10,10};
        PartitionArrayIntoThreeParts partsWithEqualSum = new PartitionArrayIntoThreeParts();
        assertTrue(partsWithEqualSum.canThreePartsEqualSum(A));
    }
}