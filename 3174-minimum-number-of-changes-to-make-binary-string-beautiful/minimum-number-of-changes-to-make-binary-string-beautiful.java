class Solution {
    public int minChanges(String s) {
        int ans = 0;
        for(int i = 1; i < s.length(); i += 2) {
            ans += s.charAt(i - 1) + s.charAt(i) - 96 & 1;
        }
        return ans;
    }
}