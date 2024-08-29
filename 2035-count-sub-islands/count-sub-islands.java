class Solution {
    private int m, n;
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        m = grid1.length;
        n = grid1[0].length;
        int count = 0;

        // Iterate over the grid to find sub-islands
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Start a DFS only if the current cell is part of grid2 and grid1
                if (grid2[i][j] == 1) {
                    if (dfs(grid1, grid2, i, j)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    
    private boolean dfs(int[][] grid1, int[][] grid2, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid2[i][j] == 0) {
            return true;
        }
        
        // Mark the current cell in grid2 as visited
        grid2[i][j] = 0;
        
        // If the corresponding cell in grid1 is 0, it's not part of a valid sub-island
        boolean isSubIsland = (grid1[i][j] == 1);
        
        // Recursively visit all 4 directions
        isSubIsland &= dfs(grid1, grid2, i + 1, j);
        isSubIsland &= dfs(grid1, grid2, i - 1, j);
        isSubIsland &= dfs(grid1, grid2, i, j + 1);
        isSubIsland &= dfs(grid1, grid2, i, j - 1);

        return isSubIsland;
    }
}