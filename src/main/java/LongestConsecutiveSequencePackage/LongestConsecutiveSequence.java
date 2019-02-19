package LongestConsecutiveSequencePackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int num : numsSet) {
            if (!numsSet.contains(num-1)) {
                int tempNum = num;
                int tempMax = 1;
                while (numsSet.contains(tempNum+1)) {
                    tempNum++;
                    tempMax++;
                }

                max = Math.max(tempMax, max);
            }
        }

        return max;
    }
}
