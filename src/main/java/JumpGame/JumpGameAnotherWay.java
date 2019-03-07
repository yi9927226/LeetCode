package JumpGame;

public class JumpGameAnotherWay {
    public boolean canJump(int[] nums) {
        int tempLastIndex = nums.length - 1;
        int index = tempLastIndex - 1;
        if (nums.length == 1) {
            return true;
        } else {
            while (index >= 0) {
                if (nums[index] >= tempLastIndex - index) {
                    tempLastIndex = index;
                }
                index--;
            }
        }
        return tempLastIndex == 0;
    }
}
