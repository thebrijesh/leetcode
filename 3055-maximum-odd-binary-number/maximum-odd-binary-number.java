class Solution {
public static String maximumOddBinaryNumber(String s) {
        int zeroCount = 0;
        int oneCount = 0;

        // count how many zeroes or one
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zeroCount++;
            }else{
                oneCount++;
            }
        }

        // make empty old string and add 1 and zero's
            int n = s.length();
            s = "";
        for(int i = 0; i < n-1; i++){
            if(i < oneCount-1){
                s = s + "1";

            } else {
                s = s + "0";
            }
        }
        s = s + "1";


        return s;
    }
}