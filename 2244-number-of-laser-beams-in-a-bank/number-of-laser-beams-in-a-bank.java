class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        int l = 0;
        int temp = 0;
        int ans = 0;
        for(int i = 0; i < bank.length; i++){
            int count = 0;
            
            for(int k = 0; k < bank[i].length(); k++){
                if(bank[i].charAt(k) == '1'){
                count++;
                }
            }
                
            if(count > 0){
            ans += temp * count;
            temp = count;
            
            }
            
                
            
            
            
        }

        
        return ans;
    }
}