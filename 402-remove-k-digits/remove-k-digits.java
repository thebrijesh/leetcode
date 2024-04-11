class Solution {
     public String removeKdigits(String num, int k) {
        int len = num.length();
        if(k==len)
            return "0";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(k>0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){ 
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }

        while(sb.length()>0 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.length()==0?"0":sb.toString();
    }
}

// 219816875132185476459