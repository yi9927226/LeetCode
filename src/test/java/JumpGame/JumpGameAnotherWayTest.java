package JumpGame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpGameAnotherWayTest {

    @Test
    public void canJump() {
        int[] nums = new int[]{2,3,1,1,4};
        JumpGameAnotherWay jumpGame = new JumpGameAnotherWay();
        assertEquals(true, jumpGame.canJump(nums));
    }
    @Test
    public void canJump001() {
        int[] nums = new int[]{0,1};
        JumpGameAnotherWay jumpGame = new JumpGameAnotherWay();
        assertEquals(false, jumpGame.canJump(nums));
    }
    @Test
    public void canJump002() {
        int[] nums = new int[]{1,2};
        JumpGameAnotherWay jumpGame = new JumpGameAnotherWay();
        assertEquals(true, jumpGame.canJump(nums));
    }
}