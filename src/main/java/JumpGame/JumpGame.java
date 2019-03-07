package JumpGame;

import java.util.Arrays;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        } else {
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] >= nums.length - i - 1) {
                    return canJump(Arrays.copyOfRange(nums, 0, i + 1));
                }
            }
        }
        return false;
    }
}
