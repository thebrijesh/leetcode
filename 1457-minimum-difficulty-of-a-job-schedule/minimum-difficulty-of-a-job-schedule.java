import java.util.*;

class Solution {

    private int find(List<Integer> job, int d, int start, int n, int[][] dp) {
        if (dp[start][d] != -1) return dp[start][d];
        if (d == 1) {
            int res = Integer.MIN_VALUE;
            for (int i = start; i < n; i++) {
                res = Math.max(res, job.get(i));
            }
            return res;
        } else {
            int val = Integer.MIN_VALUE;
            int res = Integer.MAX_VALUE;

            for (int i = start; i < n - d + 1; i++) {
                val = Math.max(val, job.get(i));
                res = Math.min(res, val + find(job, d - 1, i + 1, n, dp));
            }
            return dp[start][d] = res;
        }
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        int size = jobDifficulty.length;

        if (size < d) return -1;

        int[][] dp = new int[size + 1][d + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        List<Integer> jobList = new ArrayList<>();
        for (int j : jobDifficulty) {
            jobList.add(j);
        }

        return find(jobList, d, 0, size, dp);
    }

}
