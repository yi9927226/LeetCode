package RemoveDuplicatesFromSortedArrayPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4};
        System.out.println(removeDuplicates(nums));
        printNumArray(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int tempPtr = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int no = 0; no < nums.length; no++) {
            if (!numSet.contains(nums[no])) {
                numSet.add(nums[no]);
                nums[tempPtr] = nums[no];
                tempPtr ++;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, tempPtr);

        return numSet.size();
    }

    public static void printNumArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ,");
        }
    }
}
