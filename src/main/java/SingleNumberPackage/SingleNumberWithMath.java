package SingleNumberPackage;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberWithMath {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 2, 4};
        System.out.println(singleNumber(nums));
    }

    private static Set<Integer> set = new HashSet<>();
    public static int singleNumber(int[] nums) {
        int totalForNum = 0;
        for (int num : nums) {
            set.add(num);
            totalForNum = totalForNum + num;
        }
        int totalForSet = set.stream().reduce((prev, next) -> prev + next).get();
        return 2 * totalForSet - totalForNum;
    }
}
