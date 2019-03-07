package JumpGame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpGameTest {
    @Test
    public void canJump() {
        int[] nums = new int[]{2,3,1,1,4};
        JumpGame jumpGame = new JumpGame();
        assertEquals(true, jumpGame.canJump(nums));
    }
    @Test
    public void canJump001() {
        int[] nums = new int[]{0,1};
        JumpGame jumpGame = new JumpGame();
        assertEquals(false, jumpGame.canJump(nums));
    }
    @Test
    public void canJump002() {
        int[] nums = new int[]{1,2};
        JumpGame jumpGame = new JumpGame();
        assertEquals(true, jumpGame.canJump(nums));
    }
}