class Solution {
    public int numSteps(String s) {
        int ans  = 0;
        int carry = 0;

        for(int i = s.length()-1; i >0; i--){
            if((s.charAt(i)-'0')+ carry %2 == 1){
                ans+= 2;
                carry = 1;
            }else{
                ans += 1;
            }

        }
        return ans + carry;
    }
}