class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int value = 0;
          Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
          
           
            if(map.containsKey(nums[i])){
               
                value  = Math.abs(map.get(nums[i])-i);
               
                if(value<=k){
                    return true;
                }else {  
                    map.put(nums[i],i);
                      }
            }else{
                  map.put(nums[i],i);
            }
            
        }
        return false;
    }
}