class Solution {
    public String reverseParentheses(String s) {

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                list.add(i);
            }else if(str.charAt(i) == ')'){
                int left = list.get(list.size()-1);
                int right = i;

                StringBuilder  substr = new StringBuilder(str.substring(left+1,right));
            
                substr.reverse();
                str.replace(left+1,right,substr.toString());

                str.deleteCharAt(left);
                str.deleteCharAt(right-1);
                i = i-2;
                list.remove(list.size()-1);
                
            }

        }

       
        return str.toString();
    }

    
}