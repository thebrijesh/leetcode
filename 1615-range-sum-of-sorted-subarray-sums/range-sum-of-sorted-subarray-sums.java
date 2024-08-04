class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[n * (n + 1) / 2];
        int k = 0; 
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                arr[k++] = sum; 
            }
        }

        Arrays.sort(arr);
        long ans = 0;
        for(int i = left-1; i < right; i++){
            ans += (long) arr[i];
        }

        return (int) (ans % 1000000007);
    }
}