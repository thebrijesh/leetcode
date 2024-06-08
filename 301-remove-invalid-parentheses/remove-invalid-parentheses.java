class Solution {
    int len = 0;
    HashSet<String> set = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        
        len = 0;
        set = new HashSet<>();
        solve(s, 0, "");
        for (String str : set) {
            list.add(str);
        }
        return list;
    }

    public void solve(String s, int i, String string) {
        if (isValid(string) <0)
            return;
        if (i == s.length()) {
            if (isValid(string)==0){
                    if(string.length() > len){
                        len = string.length();
                        set = new HashSet<>();
                        set.add(string);
                    }else if(string.length() == len)set.add(string);
            }
                

            return;
        }
        String str = string + s.charAt(i);

        solve(s, i + 1, str);
        if (s.charAt(i) == '(' || s.charAt(i) == ')') {

            solve(s, i + 1, string);

        }

    }

    public int isValid(String s) {

        int open = 0, close = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == ')') {
                if (ch == '(')
                    open++;
                else if (ch == ')')
                    close++;

                if (close > open) {
                    return -1;

                }
            }

        }
       
        return open - close;
    }

}