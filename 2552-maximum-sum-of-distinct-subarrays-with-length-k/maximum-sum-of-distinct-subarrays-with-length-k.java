class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = nums[i - 1] + prefixSum[i - 1];
        }
        int[] index = new int[100001];
        long maxSum = 0;
        for (int e = 1, s = 0; e <= nums.length; e++) {
            s = Math.max(s, Math.max(e - k, index[nums[e - 1]]));
            if (e - s == k) {
                maxSum = Math.max(maxSum, prefixSum[e] - prefixSum[s]);
            }
            index[nums[e - 1]] = e;
        }
        return maxSum;
    }
}