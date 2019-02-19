package SingleNumberPackage;

public class SingleNumberWithBitManipulation {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 2, 4};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int i = 0;
        for (int num : nums) {
            i = i ^ num;
        }
        return i;
    }
}
