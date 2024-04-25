class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];

        char[] ch = s.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < dp.length; j++ ){
                
                if(Math.abs(j - (ch[i] - 'a'))<= k){
                    max = Math.max(dp[j],max);
                }
            }
            dp[ch[i] - 'a'] = max + 1;
        }
        int max = 0;
        for(int i : dp){
           max =  Math.max(max,i);
        }
        return max;
    }
}