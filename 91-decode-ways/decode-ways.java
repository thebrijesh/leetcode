class Solution {
    public int numDecodings(String s) {
        char[] ch = s.toCharArray();
        if(ch[0] == '0')return 0;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (ch[i - 1] == '0' && ch[i] == '0') {
                dp[i] = 0;
            } else if (ch[i - 1] == '0' && ch[i] != '0') {
                dp[i] = dp[i - 1];
            } else if (ch[i - 1] != '0' && ch[i] == '0') {
                if (ch[i - 1] < '3') {
                    dp[i] = (i > 1 ? dp[i - 2] : 1);
                }else{
                    dp[i] = 0;
                }
            }else{
                if(ch[i-1] < '2' || (ch[i-1] == '2' && ch[i] <= '6')  ){
                    dp[i] = dp[i-1] + (i > 1 ? dp[i - 2] : 1);
                }else{
                    dp[i] = dp[i-1];
                }
            }
        }
        return dp[s.length()-1];
    }
}