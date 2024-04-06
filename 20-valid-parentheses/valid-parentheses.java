class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(char ch : s.toCharArray()){
            if(st.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))return false;
            if(ch == '(' || ch == '{' || ch == '[')st.push(ch);
            else{
                if((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '['))st.pop();
                else return false;
            }
        }

        if(!st.isEmpty())return false;
        return true;
    }
}