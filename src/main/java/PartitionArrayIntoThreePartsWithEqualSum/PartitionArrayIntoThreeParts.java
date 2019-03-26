package PartitionArrayIntoThreePartsWithEqualSum;

import java.util.Arrays;

public class PartitionArrayIntoThreeParts {
    public boolean canThreePartsEqualSum(int[] A) {
        if (Arrays.stream(A).sum() % 3 != 0) {
            return false;
        }
        int tempSum = Arrays.stream(A).sum() / 3;
        int count = 0;
        int sum = 0;
        for (int i : A) {
            sum += i;
            if (sum == tempSum) {
                sum = 0;
                count ++;
            }
        }

        return count == 3;
    }
}
