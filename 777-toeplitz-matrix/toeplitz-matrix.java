class Solution {
    public boolean isToeplitzMatrix(int[][] nums) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums[i].length-1; j++){
                if(nums[i][j] != nums[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}