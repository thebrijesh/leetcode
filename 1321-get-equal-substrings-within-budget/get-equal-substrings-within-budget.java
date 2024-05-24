class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int ans = 0; int j = 0; int oans = 0;
        int sum = 0;
        for(int i = 0; i < ch1.length; i++){
            int cost = Math.abs(ch1[i] - ch2[i]);
            sum += cost;
            if(sum <= maxCost){
                ans = Math.max(ans,i-j+1);
            }else{
                while(sum > maxCost){
                    sum -= Math.abs(ch1[j] - ch2[j]);
                    j++;
                }
            }
            
            
        }
        

        return ans;
    }
}