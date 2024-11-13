class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return findPair(nums,upper) - findPair(nums,lower-1);
    }


    public long findPair(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        long ans = 0;

        while(start < end){
            if(arr[start] + arr[end] <= target){
                ans += end -  start;
                start++;
            }else{
                end--;
            }
        }

        return ans;
    
    }
}