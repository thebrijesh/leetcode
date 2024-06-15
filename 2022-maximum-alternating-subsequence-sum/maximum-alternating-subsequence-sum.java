class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length][2];
        for(long arr[]:dp)Arrays.fill(arr,-1);
       long ans = solve(nums,0,0,dp);
       return ans;
    }

    public long solve(int[] nums, int idx, int flag, long[][] dp){
        if(idx > nums.length-1)return 0;

        


        if(dp[idx][flag] != (long)(-1)){
            return dp[idx][flag];
        }
        long skip = solve(nums,idx+1,flag,dp);
        long val = nums[idx];
        if(flag == 1)val = -val;
        long take = 0;

        if(flag == 0){
            take = val + solve(nums,idx+1,1,dp);

        }else{
            take = val + solve(nums,idx+1,0,dp);
        }
        
        return dp[idx][flag] =  Math.max(skip, take);
    }
}