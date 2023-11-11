class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int lsum = 0; int rsum = 0;

        for(int i = 0; i < nums.length; i++){

            if(i > 0){
                lsum += nums[i-1];
            }
            
            rsum = sum - (lsum + nums[i]);
            if(lsum == rsum){
                return i;
            } 
        }
        return -1;
    }
}