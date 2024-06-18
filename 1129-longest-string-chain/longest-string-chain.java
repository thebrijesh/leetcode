class Solution {
    public class mwords {
        int n;
        String str;

        mwords(int n, String str) {
            this.n = n;
            this.str = str;
        }
    }

    public int longestStrChain(String[] words) {
        mwords[] arr = new mwords[words.length];
        int idx = 0;
        for (String s : words) {
            arr[idx++] = new mwords(s.length(), s);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a.n, b.n));
        for (int i = 0; i < arr.length; i++) {
            words[i] = arr[i].str;
        }

        int[][] dp = new int[words.length + 1][words.length + 1];
        for (int[] arrh : dp) {
            Arrays.fill(arrh, -1);
        }

        return dfs(words, 0, -1, dp);

    }

    public int dfs(String[] str, int idx, int pre, int[][] dp) {
        if (idx >= str.length)
            return 0;
        if (pre != -1 && dp[idx][pre] != -1) {
            return dp[idx][pre];
        }

        int take = Integer.MIN_VALUE;

        if (pre == -1 || str[pre].length() < str[idx].length()) {
            if (pre == -1){
                take = 1 + dfs(str, idx + 1, idx, dp);
            }else if(str[pre].length() + 1 == str[idx].length() && isPred(str[pre], str[idx])) {
                take = 1 + dfs(str, idx + 1, idx, dp);
            }

        }
        int skip = dfs(str, idx + 1, pre, dp);
        if (pre != -1) {
            return dp[idx][pre] = Math.max(skip, take);
        }
        return Math.max(skip, take);
    }

    public boolean isPred(String str1, String str2) {
        int n = str2.length();
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (str1.charAt(i) != str2.charAt(j)) {
                j++;
            } else if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }

            if (i == str1.length())
                return true;
        }
        return false;
    }
}