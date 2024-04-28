class Solution {
    public int calculateMinimumHP(int[][] arr) {
        
       int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a1 : dp) {
			Arrays.fill(a1, -1);
		}
		return (calculateMinimum(arr, 0, 0, dp));

	}

	public static int calculateMinimum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cr == arr.length || cc == arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc] > 0 ? 1 : 1 - arr[cr][cc];
		}
		int left = calculateMinimum(arr, cr, cc + 1, dp);
		int right = calculateMinimum(arr, cr + 1, cc, dp);
		int p = Math.min(left, right) - arr[cr][cc];

		return dp[cr][cc] = p > 0 ? p : 1;

	}

}