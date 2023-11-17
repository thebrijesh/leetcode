class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;  
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                int rmax = Integer.MIN_VALUE;
                int cmax = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < grid.length; k++){
                    rmax = Math.max(rmax,grid[i][k]);
                }
                for(int k = 0; k < grid[i].length; k++){
                    cmax = Math.max(cmax,grid[k][j]);
                }
                min = Math.min(rmax,cmax);
                count += min - grid[i][j];
            }
        }
        return count;
    }
}