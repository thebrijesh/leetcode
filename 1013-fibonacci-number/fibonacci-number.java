class Solution {
    public int fib(int n) {
        if(n == 1)return 1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        fib(n,dp);
        return dp[n];
    }
    public int fib(int n, int[] dp){
        if(n <= 1)return n;
        if(dp[n] != -1)return dp[n];
        dp[n] = fib(n-1,dp) + fib(n-2,dp);
        return dp[n];
    }
}