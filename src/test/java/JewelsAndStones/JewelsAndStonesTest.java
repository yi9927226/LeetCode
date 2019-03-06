package JewelsAndStones;

import static org.junit.Assert.*;

import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStones() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        assertEquals(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"), 3);
    }
}