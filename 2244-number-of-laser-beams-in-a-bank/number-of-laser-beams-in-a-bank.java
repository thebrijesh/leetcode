class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        int l = 0;
        for(int i = 0; i < bank.length; i++){
            int count = 0;
            
                for(int k = 0; k < bank[i].length(); k++){
                    if(bank[i].charAt(k) == '1'){
                    count++;
                }
                }
                
            if(count != 0){
                arr[l++] = count;
                System.out.println(count);
            }
            
            
        }
        int ans = 0;
        for(int i = 0; i < arr.length-1; i++){
            
                ans += arr[i] * arr[i+1];
            
        }

        
        return ans;
    }
}