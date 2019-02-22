package HouseRobberPackage;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int[] tempTables =  new int[nums.length+2];
        tempTables[nums.length] = 0;
        tempTables[nums.length+1] = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            tempTables[i] = Math.max(nums[i] + tempTables[i+2], tempTables[i+1]);
        }
        return tempTables[0];
    }
}
