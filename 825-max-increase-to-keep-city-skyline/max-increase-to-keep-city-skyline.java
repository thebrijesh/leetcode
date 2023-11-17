class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;  
        int[] rarr = new int[grid.length];
        int[] carr = new int[grid.length];
        int rmax = Integer.MIN_VALUE;
        int cmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
               
               rarr[j] = Math.max(rarr[j], grid[j][i]);
               carr[j] = Math.max(carr[j],grid[i][j]);
            }
            
        }

         for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
               min = Math.min(rarr[i], carr[j]);
               count += Math.abs(min - grid[i][j]);
               
            }
        }

        return count;
    }
}