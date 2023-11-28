class Solution {
    public int numberOfWays(String str) {
        int count = 0; long ans = 1; long j = 0;
        char[] ch = str.toCharArray();
        long mod = 1000000007;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'S'){
                if(++count > 2 && count % 2 == 1)ans = ans * (i-j) % mod;
                j = i;
            }
            
        }
        return (count % 2 == 0 && count > 0) ? (int) ans : 0;
    }
}