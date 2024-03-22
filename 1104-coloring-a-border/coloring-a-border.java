class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        if(grid==null || grid.length==0)
            return null;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        helper(grid,row,col,color,grid[row][col],visited);
        return grid;
    }

    private void helper(int[][] grid, int row,int col, int color, int oldColor, boolean[][] visited){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]!=oldColor || visited[row][col])
            return;
        visited[row][col]=true;
        boolean border = false;
        if(row==0 || col==0 || row==grid.length-1 || col==grid[0].length-1 || grid[row-1][col]!=oldColor || grid[row+1][col]!=oldColor || grid[row][col-1]!=oldColor || grid[row][col+1]!=oldColor)
            border=true;
        helper(grid,row+1,col,color,oldColor,visited);
        helper(grid,row-1,col,color,oldColor,visited);
        helper(grid,row,col-1,color,oldColor,visited);
        helper(grid,row,col+1,color,oldColor,visited);
        if(border)
            grid[row][col]=color;
    }
}