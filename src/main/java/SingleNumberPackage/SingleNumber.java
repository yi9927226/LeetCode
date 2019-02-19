package SingleNumberPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 2, 4};
        System.out.println(singleNumber(nums));
    }

    private static Map<Integer, Integer> map = new HashMap<>();
    public static int singleNumber(int[] nums) {
        for (int num : nums) {
            if (!map.keySet().contains(num)) {
                map.put(num, 1);
            } else {
                map.put(num, 2);
            }
        }
        return map.keySet().stream().filter(num -> map.get(num) == 1).collect(Collectors.toList()).get(0);
    }
}
