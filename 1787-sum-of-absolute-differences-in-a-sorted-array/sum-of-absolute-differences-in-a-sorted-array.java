class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i]; 
        }
        int lsum = 0; int rsum = 0; int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans = nums[i];
          totalSum -= nums[i];
           int lMulti = nums[i] * i;
           int rMulti = nums[i] * ((nums.length -i)-1);
          
           nums[i] = Math.abs(lsum - lMulti)+ Math.abs(totalSum - rMulti);
            lsum += ans;
        }
        return nums;      
    }
}