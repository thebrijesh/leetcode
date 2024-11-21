class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1;
        }
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 1;
        }
        for (int[] guard : guards) {
            int x = guard[0], y = guard[1];
            for (int i = x - 1; i >= 0; i--) {
                if (grid[i][y] == 1)
                    break;
                grid[i][y] = -1;
            }
            for (int i = x + 1; i < m; i++) {
                if (grid[i][y] == 1)
                    break;
                grid[i][y] = -1;
            }
            for (int i = y - 1; i >= 0; i--) {
                if (grid[x][i] == 1)
                    break;
                grid[x][i] = -1;
            }
            for (int i = y + 1; i < n; i++) {
                if (grid[x][i] == 1)
                    break;
                grid[x][i] = -1;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count += grid[i][j]==0 ? 1 : 0;
            }
        }
        return count;

    }
}