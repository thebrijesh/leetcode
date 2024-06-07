class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();

        for (String str : wordDict) {
            set.add(str);
        }
        int[] arr = new int[s.length()];
        Arrays.fill(arr, -1);

        return solve(s, set, 0, arr) == 1;
    }

    public int solve(String s, HashSet<String> set, int idx, int[] dp) {
        if (s.length() == idx) {
            return 1;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        for (int i = idx; i < s.length(); i++) {
            String prefix = s.substring(idx, i + 1);

            if (set.contains(prefix)) {
                if (solve(s, set, i + 1,dp) == 1)
                    return dp[idx] = 1;

            }
        }

        return dp[idx] = 0;
    }
}