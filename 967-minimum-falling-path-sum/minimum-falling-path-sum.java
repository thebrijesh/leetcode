class Solution {
    public int minFallingPathSum(int[][] grid) {
        Integer[][] dp = new Integer[grid.length + 1][grid[0].length];
        int ans = Integer.MAX_VALUE;
        for (int raw = 0; raw < grid.length; raw++)
            ans = Math.min(ans, (helperRecursiveDP(grid, dp, 0, raw, grid.length)));
        // finding answers for each column of first row seperatly and storing the
        // minimum value in variable ans
        return ans;
    }

    // helper function which computes the result for each column in row 1
    private int helperRecursiveDP(int[][] grid, Integer[][] dp, int raw, int col, int n) {
        if (col >= n || col < 0) // base-case 1
            return (int) Math.pow(10, 7);

        if (raw == n - 1)
            return grid[raw][col]; // base-case 2

        if (dp[raw][col] != null)
            return dp[raw][col]; // avoiding repetitive steps by returning previously calculated ans

        // Traversing path according to the question
        int x = grid[raw][col] + helperRecursiveDP(grid, dp, raw + 1, col, n);
        int y = grid[raw][col] + helperRecursiveDP(grid, dp, raw + 1, col + 1, n);
        int z = grid[raw][col] + helperRecursiveDP(grid, dp, raw + 1, col - 1, n);

        int ans = Math.min(x, Math.min(y, z)); // finding min of values returned by three traversed paths
        dp[raw][col] = ans;

        return ans;
    }
}