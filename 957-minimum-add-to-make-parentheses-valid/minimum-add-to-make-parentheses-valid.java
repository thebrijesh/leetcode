class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            close += s.charAt(i) == '(' ? 1 : -1;
            // It is guaranteed bal >= -1
            if (close <0) {
                open++;
                close= 0;
            }
        }
        return open + close;
    }
}