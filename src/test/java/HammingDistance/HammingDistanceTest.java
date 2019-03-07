package HammingDistance;

import static org.junit.Assert.*;

import org.junit.Test;

public class HammingDistanceTest {

    @Test
    public void hammingDistance() {
        HammingDistanceAnother hammingDistance = new HammingDistanceAnother();
        assertEquals(2, hammingDistance.hammingDistance(93, 73));
    }
}