class Solution {
    public int minCostClimbingStairs(int[] cost) {

        // recurrance relation

       // dp[i] = Math.min(cost[i] + dp[i - 2], cost[i] + dp[i - 1])

        int dp[] = new int[cost.length+1];
       
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(cost[i] + dp[i - 2], cost[i] + dp[i - 1]);
        }
        return Math.min(dp[cost.length - 1] , dp[cost.length -2]);
    }
       
}