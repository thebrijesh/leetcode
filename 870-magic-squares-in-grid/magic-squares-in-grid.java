class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (grid[i + 1][j + 1] != 5)
                    continue;
                int[] freq = new int[10];
                int[] row = new int[3];
                int[] col = new int[3];

                boolean falg = true;

                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        int num = grid[x + i][y + j];

                        row[x] += num;
                        col[y] += num;

                        
                        if (num == 0 || num > 9 || freq[num] > 1 ) {
                            falg = false;
                            break;
                        }
                        freq[num]++;

                        if (!falg)
                            break;

                    }

                }

                int digi = row[0];

                if (row[1] != digi || row[2] != digi || col[0] != digi || col[1] != digi || col[2] != digi)
                    falg = false;

                if (falg) {
                    ans++;
                }

            }
        }

        return ans;
    }

}