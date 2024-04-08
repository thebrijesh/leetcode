public class Solution {
    public boolean canJump(int[] nums) {
    int[] dp = new int[nums.length];

    return helper(nums,0,dp);
    }

    public boolean helper(int[] nums,int idx,int[] dp){
        if(idx == nums.length-1)return true;
        if(dp[idx] != 0){
            if(dp[idx] == 1)return true;
            else return false;
        }
        for(int i = idx+1; i <= idx + nums[idx] && i < nums.length; i++){

            if(helper(nums,i,dp)){
                dp[idx] = 1;
                return true;
            }
        }
        dp[idx] = 2;
        return false;
    }
}
