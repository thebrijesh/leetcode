class Solution {
    public int numEnclaves(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid[0].length - 1; i++) {

            helper(grid, 0, i);
            helper(grid, grid.length - 1, i);

        }

        for (int i = 1; i < grid.length - 1; i++) {
            helper(grid, i, 0);
            helper(grid, i, grid[0].length - 1);

        }

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    public void helper(int[][] grid, int row, int col) {
        if (row > grid.length - 1 || row < 0 || col > grid[0].length - 1 || col < 0 || grid[row][col] != 1) {
            return;
        }

        grid[row][col] = 0;

        helper(grid, row + 1, col);

        helper(grid, row - 1, col);

        helper(grid, row, col + 1);

        helper(grid, row, col - 1);

    }
}