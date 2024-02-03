class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {

        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return maxSumHelper(arr,0,k,dp);
    }

    public  int maxSumHelper(int[] arr,int idx,int k,int[] dp){
        if(idx >= arr.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int max1 = Integer.MIN_VALUE;
        int i = idx; int b = 0;
        for(; i<arr.length && i<idx+k; i++){
            max1 = Math.max(max1,arr[i]);
            b = Math.max(b,(max1 * (i+1 - idx)) + maxSumHelper(arr,i+1,k,dp));
        }
        return dp[idx] = b;
    } 

}