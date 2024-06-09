class Solution {
    int[] dp;
    public int maxTotalReward(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        dp = new int[sum+1];
        Arrays.fill(dp,-1);
        return maxReward(arr, 0, 0);
    }

    private int maxReward(int[] arr, int index, int x) {
        if(index >= arr.length) {
            return x;
        }
        if(dp[x] != -1) {
            return dp[x];
        }
        int not = maxReward(arr, index+1, x);
        int right = 0;
        if(x < arr[index]) {
             right = maxReward(arr, index+1, x+arr[index]);
        }
        return dp[x] = Math.max(not, right);
    }
}