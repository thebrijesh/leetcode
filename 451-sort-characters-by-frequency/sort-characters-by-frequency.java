class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        char[] arr = new char[128];
        for(int i = 0; i < ch.length; i++){
            arr[ch[i]]++;
        }
        int idx = 0; 
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                    idx = j;

                }
                
            }
            for(int k = 0; k < arr[idx]; k++){
                str.append((char)idx);
            }
            arr[idx] = 0;
        } 

        return str.toString();
    }
}