class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)nums[i] = -1;
            if(i > 0){
                nums[i] += nums[i-1];
                
            }
            if( !map.containsKey(nums[i])){
                    map.put(nums[i],i);
                }else{
                    max = Math.max(max,i - map.get(nums[i])); 
                }
        }
        return max;
    }
}