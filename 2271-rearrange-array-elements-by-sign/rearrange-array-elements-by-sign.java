class Solution {
    private static int finded(boolean idx, int[] nums, int i){
        if(idx){
             while(i < nums.length && nums[i] < 0 ){
                i++;
             }
        }else{
            while(i < nums.length && nums[i] > 0 ){
                i++;
            }
        }
        return i;
    } 
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        boolean idx = true;
        int i=-1;
        int j=-1;
        for(int k = 0; k < arr.length; k++){
            if(idx){
                i = finded(idx,nums,i+1);
                idx = !idx;
                arr[k] = nums[i];
            }else{
                j = finded(idx,nums,j+1);
                idx = !idx;
                arr[k] = nums[j];
            }
           

        }
        return arr;
    }
}