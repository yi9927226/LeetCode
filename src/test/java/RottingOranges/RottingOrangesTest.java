package RottingOranges;

import static org.junit.Assert.*;

import org.junit.Test;

public class RottingOrangesTest {

    @Test
    public void orangesRotting() {
        int[][] grid = new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, new RottingOranges().orangesRotting(grid));
    }
    @Test
    public void orangesRotting2() {
        int[][] grid = new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(-1, new RottingOranges().orangesRotting(grid));
    }
    @Test
    public void orangesRotting3() {
        int[][] grid = new int[][] {{2, 0, 0}};
        assertEquals(0, new RottingOranges().orangesRotting(grid));
    }
}