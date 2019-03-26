package PartitionArrayIntoThreePartsWithEqualSum;

import java.util.Arrays;

/**
 * @author 1611003
 * 會超時
 *
 */
public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        for (int thirdIndex = 2; thirdIndex < A.length; thirdIndex++) {
            for (int secondIndex = thirdIndex - 1; secondIndex > 0; secondIndex--) {
                if (Arrays.stream(Arrays.copyOfRange(A, 0, secondIndex)).sum() ==
                        Arrays.stream(Arrays.copyOfRange(A, secondIndex, thirdIndex)).sum() &&
                        Arrays.stream(Arrays.copyOfRange(A, 0, secondIndex)).sum() ==
                                Arrays.stream(Arrays.copyOfRange(A, thirdIndex, A.length)).sum()) {
                    return true;
                }
            }
        }

        return false;
    }
}
