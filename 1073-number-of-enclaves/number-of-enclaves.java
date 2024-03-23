class Solution {
    public int numEnclaves(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] == 1) {
                helper(grid, 0, i);
            }
            if (grid[grid.length - 1][i] == 1) {
                helper(grid, grid.length - 1, i);
            }
        }
        for (int i = 1; i < grid.length - 1; i++) {
            if (grid[i][0] == 1) {
                helper(grid, i, 0);
            }
            if (grid[i][grid[0].length - 1] == 1) {
                helper(grid, i, grid[0].length - 1);
            }
        }

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[i][j] == 1) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public void helper(int[][] grid, int row, int col) {
        if (row > grid.length - 1 || row < 0 || col > grid[0].length - 1 || col < 0) {
            return;
        }
        if (grid[row][col] == 1) {
            grid[row][col] = 0;
        }
        if (row < grid.length - 1 && grid[row + 1][col] == 1) {
            helper(grid, row + 1, col);
        }
        if (row > 0 && grid[row - 1][col] == 1) {
            helper(grid, row - 1, col);
        }
        if (col < grid[0].length-1 && grid[row][col + 1] == 1) {
            helper(grid, row, col + 1);

        }
        if (col > 0 && grid[row][col - 1] == 1) {
            helper(grid, row, col - 1);

        }

    }
}