class Solution {
    public int minFallingPathSum(int[][] grid) {
        int min = 0, sMin = 1;

        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] < grid[0][min]) {
                sMin = min;
                min = i;

            } else if (i != min && grid[0][i] < grid[0][sMin]) {
                sMin = i;
            }
        }
        for (int i = 1; i < grid.length; i++) {
            int min1 = 0 , sMin1 = 1; 
            for (int j = 0; j < grid[i].length; j++) {

                if(j == min){
                    grid[i][j] += grid[i-1][sMin];
                }else{
                    grid[i][j] += grid[i-1][min];
                }

                if (grid[i][j] < grid[i][min1]) {
                    sMin1 = min1;
                    min1 = j;

                } else if (j != min1 && grid[i][j] < grid[i][sMin1]) {
                    sMin1 = j;
                }
            }
            min = min1;
            sMin = sMin1;
        }
        return grid[grid.length-1][min];
    }
}