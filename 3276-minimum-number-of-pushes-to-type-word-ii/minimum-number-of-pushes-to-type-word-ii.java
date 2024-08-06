class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        
        for(char ch: word.toCharArray()){
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int i = arr.length-1;
        int ans = 0;
        int count =1;
        
        while(i >= 0){
            int j = 0;
            int sum = 0;
            while( j < 8 && i >=0){
                if(arr[i] != 0){
                    sum += arr[i];
                    j++;
                }
                
                i--;
            }
            ans += sum * count;
            count++;
        }

        return ans;
    }
}