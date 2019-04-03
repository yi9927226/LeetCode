package SquaresOfASortedArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquaresOfASortedArrayTest {

    @Test
    public void sortedSquares() {
        for (int i : new SquaresOfASortedArray()
                .sortedSquares(new int[]{-4, -1, 0, 3, 10})) {
            System.out.println(i + ",");
        }
    }
}