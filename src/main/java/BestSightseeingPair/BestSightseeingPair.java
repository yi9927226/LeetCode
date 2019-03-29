package BestSightseeingPair;

public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] A) {
        int i = 0;
        int max = A[i] + i;
        for (int j = 1; j < A.length; j++) {
            int curr = A[i] + A[j] + i - j;
            max = curr > max ? curr : max;

            // update the value of i to the one that maximizes
            if (A[i] + i < A[j] + j) {
                i = j;
            }
        }
        return max;
    }
}
