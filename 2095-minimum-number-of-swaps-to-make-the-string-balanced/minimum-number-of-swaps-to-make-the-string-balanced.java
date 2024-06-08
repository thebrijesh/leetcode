class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int ans = 0;
        for(char c:s.toCharArray()){
            if(c=='[') count++;
            else if(count==0) ans++;
            else count--;
        }
        return (ans+1)/2;
    }
}