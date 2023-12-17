class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2510];
        int[] ans = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                arr[grid[i][j]]++;
            }
        }
        for(int i =1; i< arr.length; i++){
            if(arr[i] == 2){
                ans[0] = i;
            }
            if(arr[i] == 0 && ans[1] == 0){
                ans[1] = i;
               
            }
                
            
            
        }

        return ans;
    }
}