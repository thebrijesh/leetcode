class Solution {
    public int numSpecial(int[][] nums) {
        int[] raw = new int[nums.length];
        int[] col = new int[nums[0].length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j  = 0; j < nums[i].length; j++){
                if(nums[i][j] == 1){
                    count++;
                    
                }
            }
            raw[i] = count; 
            count = 0;
        }
            count = 0;
        for(int i = 0; i < nums[0].length; i++){
            for(int j  = 0; j < nums.length; j++){
                if(nums[j][i] == 1){
                    count++;
                     
                }
            }
            col[i] = count;
            count = 0;
        }

            count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j  = 0; j < nums[i].length; j++){
                if(nums[i][j] == 1 && raw[i] == 1 && col[j] == 1)count++;
            }
        }
        return count;
    }
}