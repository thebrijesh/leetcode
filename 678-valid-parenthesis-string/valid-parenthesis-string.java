class Solution {
    public boolean checkValidString(String s) {
        int omin=0;
        int omax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                omax++;
                omin++;
            }
            else if(s.charAt(i)==')'){
                omax--;
                omin--;
            }
            else{
                omax++;
                omin--;
            }
            if(omax<0){
                return false;
            }
            omin=Math.max(0,omin);

            // System.out.print(omin + " " + omax + "|| ");
        }
        return omin==0;
    }
}