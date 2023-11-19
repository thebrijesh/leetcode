class Solution {
    public int reductionOperations(int[] nums) {
        int[] arr = new int[50001];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        int operation = 0;
        int count = 0;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != 0){
                count += arr[i];
                operation += count - arr[i];
            }
        }
        return operation;
    }
}