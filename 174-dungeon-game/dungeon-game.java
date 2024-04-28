class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        dungeon[m - 1][n - 1] = Math.max(1 - dungeon[m - 1][n - 1], 1);
        // for (int i = m - 2; i >= 0; i--) {
        //     dungeon[i][n - 1] = Math.max(dungeon[i + 1][n - 1] - dungeon[i][n - 1], 1);
        // }

        // for (int j = n - 2; j >= 0; j--) {
        //     dungeon[m - 1][j] = Math.max(dungeon[m - 1][j + 1] - dungeon[m - 1][j], 1);
        // }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int down = 0;
                int right = 0;
                if(i == m-1 && j == n-1)continue;
                if (i == m - 1) {
                    dungeon[i][j] = Math.max(dungeon[i][j + 1] - dungeon[i][j], 1);
                } else if (j == n - 1) {
                    dungeon[i][j] = Math.max(dungeon[i + 1][j] - dungeon[i][j], 1);

                } else {
                    right = Math.max(dungeon[i][j + 1] - dungeon[i][j], 1);
                    down = Math.max(dungeon[i + 1][j] - dungeon[i][j], 1);
                    dungeon[i][j] = Math.min(down, right);
                }

                
            }
        }
        return dungeon[0][0];
    }
}