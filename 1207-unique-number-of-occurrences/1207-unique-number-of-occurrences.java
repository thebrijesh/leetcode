class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int ele = arr[i];
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }
        
        int[] freq = new int[20001]; //Constriant given
        
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int n = e.getValue();
            if(freq[n] != 0){
                return false;
            }
            freq[n]++;
        }
        
        return true;
    }
}