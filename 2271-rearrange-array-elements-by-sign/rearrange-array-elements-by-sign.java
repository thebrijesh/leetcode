class Solution {

    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        boolean idx = true;
        int i=0;
        int j=0;
        for(int k = 0; k < arr.length; k++){
            if(idx){
                 while(i < nums.length && nums[i] < 0 ){
                  i++;
                 }
                idx = !idx;
                arr[k] = nums[i++];
            }else{
                while(j < nums.length && nums[j] > 0 ){
                  j++;
                }
                idx = !idx;
                arr[k] = nums[j++];
            }
           

        }
        return arr;
    }
}