class Solution {
    public boolean isSubsequence(String s, String t) {
        
       return  helper(s,t,0,0);
    }

    public boolean helper(String s, String t, int i, int j){
        boolean a = false , b = false;
        if(i >= s.length()){
            return true;
        }
        if(j >= t.length()){
            return false;
        }
        if(s.charAt(i) == t.charAt(j)){
          a = helper(s,t,i+1,j+1);
        }else{
           b =  helper(s,t,i,j+1);
        }

        if(a || b)return true;
        return false;
         
    }
}