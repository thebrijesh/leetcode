class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return dfs(nums, 0, -1, dp);
    }

    public int dfs(int[] nums, int idx, int pre, int[][] dp) {
        if (idx >= nums.length)
            return 0;
        if (pre != -1 && dp[idx][pre] != -1) {
            return dp[idx][pre];
        }

        int take = Integer.MIN_VALUE;

        if (pre == -1 || nums[pre] < nums[idx]) {
          
            take = 1 + dfs(nums, idx + 1, idx, dp);
        }
        int skip = dfs(nums, idx + 1, pre, dp);
        if (pre != -1) {
            return dp[idx][pre] = Math.max(skip, take);
        }
        return Math.max(skip, take);
    }
}