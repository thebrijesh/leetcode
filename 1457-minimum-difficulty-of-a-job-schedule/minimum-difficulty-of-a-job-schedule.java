import java.util.*;

class Solution {

    private Map<String, Integer> memo;

    public Solution() {
        memo = new HashMap<>();
    }

    private int find(List<Integer> job, int d, int start, int n) {
        if (d == 1) {
            int res = Integer.MIN_VALUE;
            for (int i = start; i < n; i++) {
                res = Math.max(res, job.get(i));
            }
            return res;
        }

        String key = d + "-" + start;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int val = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;

        for (int i = start; i < n - d + 1; i++) {
            val = Math.max(val, job.get(i));
            res = Math.min(res, val + find(job, d - 1, i + 1, n));
        }

        memo.put(key, res);
        return res;
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        int size = jobDifficulty.length;
        
        if (size < d) return -1;
        
        List<Integer> jobList = new ArrayList<>();
        for (int j : jobDifficulty) {
            jobList.add(j);
        }
        
        memo.clear();  // Clear the memoization map before each run
        return find(jobList, d, 0, size);
    }

    
}
