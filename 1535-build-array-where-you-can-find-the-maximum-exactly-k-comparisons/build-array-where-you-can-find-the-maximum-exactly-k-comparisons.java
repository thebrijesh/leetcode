class Solution {
    int MOD = 1000000007;
    public int numOfArrays(int n, int m, int k) {
        int[][][] dp = new int[51][101][51];
        for (int[][] arr : dp) {
            for(int[] a : arr){
                Arrays.fill(a, -1);

            }
        }
        return solve(0, 0, 0, n, m, k,dp);
    }

    public int solve(int idx, int sCost, int max, int n, int m, int k, int[][][] dp) {
        if (idx == n) {
            if (sCost == k) {
                return 1;
            } else {
                return 0;
            }
        }
        if(dp[idx][max][sCost] != -1){
            return dp[idx][max][sCost];
        }
        int result = 0;

        for (int i = 1; i <= m; i++) {
            if (i > max) {
                result = (result + solve(idx + 1, sCost + 1, i, n, m, k,dp))% MOD;
            } else {
                result = (result +  solve(idx + 1, sCost, max, n, m, k,dp))% MOD;

            }
        }

        return dp[idx][max][sCost] = result % MOD;
    }
}