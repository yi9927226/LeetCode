package MaximumNumberOfBalloons;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxNumberOfBalloonsTest {

    @Test
    public void maxNumberOfBalloons() {
        MaxNumberOfBalloons maxNumberOfBalloons = new MaxNumberOfBalloons();
        assertEquals(1, maxNumberOfBalloons.maxNumberOfBalloons("nlaebolko"));
    }
}