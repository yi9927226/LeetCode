package MajorityElementPackage;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        float tempHalf = nums.length / 2;
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int num : nums) {
            if (!tempMap.keySet().contains(num)) {
                tempMap.put(num, 1);
            } else {
                int tempCount = tempMap.get(num) + 1;
                if (tempCount > tempHalf) {
                    return num;
                }
                tempMap.put(num, tempCount);
            }
        }
        return 0;
    }
}
