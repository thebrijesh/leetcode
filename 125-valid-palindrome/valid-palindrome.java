class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(char ch : charArray ){
            if(ch >= 'A' && ch <= 'Z'){
                str.append((char)(ch + 32));
            }else if((ch >= '0' && ch <='9') || (ch >= 'a' && ch <= 'z')){
                str.append(ch);
            }
        }
        System.out.println(str.toString());
       return  check(str.toString());
    }

    public boolean check(String s){
        char[] ch = s.toCharArray();
        int i = 0; int j = ch.length-1;
        while(i < j){
            if(ch[i] != ch[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}