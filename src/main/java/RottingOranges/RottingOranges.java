package RottingOranges;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int round = 0;
        int[][] tempGrid = getCloneGrid(grid);
        while (getFreshOrange(grid) != 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        if (i > 0 && grid[i - 1][j] == 1) {
                            tempGrid[i - 1][j] = 2;
                        }
                        if (j > 0 && grid[i][j - 1] == 1) {
                            tempGrid[i][j - 1] = 2;
                        }
                        if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                            tempGrid[i + 1][j] = 2;
                        }
                        if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                            tempGrid[i][j + 1] = 2;
                        }
                    }
                }
            }

            if (getFreshOrange(tempGrid) == getFreshOrange(grid)) {
                return -1;
            }
            grid = getCloneGrid(tempGrid);
            round++;
        }

        return round;
    }

    private int[][] getCloneGrid(int[][] grid) {
        int[][] cloneGrid = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                cloneGrid[i][j] = grid[i][j];
            }
        }
        return cloneGrid;
    }

    private int getFreshOrange(int[][] grid) {
        int temp = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    temp++;
                }
            }
        }

        return temp;
    }

}
