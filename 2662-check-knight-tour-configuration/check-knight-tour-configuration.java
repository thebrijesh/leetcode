class Solution {
    public boolean helper(int [][] grid, int raw, int col, int num){
        int n = grid.length;
        int i,j;
        if(grid[raw][col]== n * n - 1 )return true;
        // 2up 1 right
        i = raw - 2;
        j = col + 1;
        if(i >= 0 && j < n && grid[i][j] == num +1)return helper(grid,i,j,num+1);

        // 2up 1 left
        i = raw - 2;
        j = col - 1;
        if(i >= 0 && j >=0 && grid[i][j] == num +1)return helper(grid,i,j,num+1);

        // 2 Down 1 right
        i = raw + 2;
        j = col + 1;
        if(i < n && j < n && grid[i][j] == num +1)return helper(grid,i,j,num+1);
        
        // 2 Down 1 right
        i = raw + 2;
        j = col - 1;
        if(i < n && j >= 0 && grid[i][j] == num +1)return helper(grid,i,j,num+1);
        
        // 2 right 1 up
        i = raw - 1;
        j = col + 2;
        if(i >= 0 && j < n && grid[i][j] == num +1)return helper(grid,i,j,num+1);
        
        // 2right 1 Down
        i = raw + 1;
        j = col + 2;
        if(i < n && j < n && grid[i][j] == num +1)return helper(grid,i,j,num+1);

         // 2 left 1 up
        i = raw - 1;
        j = col - 2;
        if(i >= 0 && j >= 0 && grid[i][j] == num +1)return helper(grid,i,j,num+1);
        
        // 2left 1 Down
        i = raw + 1;
        j = col - 2;
        if(i < n && j >= 0 && grid[i][j] == num +1)return helper(grid,i,j,num+1);
        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0)return false;
        return helper(grid,0,0,0);
    }
}