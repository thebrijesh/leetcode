class Solution {
    public int[] getStrongest(int[] nums, int p) {
        Arrays.sort(nums);
      
        int[] ans = new int[p];
        int n = nums.length;
        int mid = nums[(n - 1) / 2];

        int i = 0;
        int j = n - 1;
        int k = 0;
        while (k < p ) {
            int val1 = mid- nums[i];
            int val2 = nums[j] - mid;

            if(val1 > val2){
                ans[k++] = nums[i++];
            } else{
                ans[k++] = nums[j--];
            }
                
                
            
        }
        return ans;
    }
}

// class Solution {
//     public int[] getStrongest(int[] arr, int k) {
//         Arrays.sort(arr);
//         int i = 0, j = arr.length - 1, p = 0;
//         int median = arr[(arr.length - 1) / 2];
//         int[] res = new int[k];
//         while (p < k) {
//             if ((median - arr[i]) > (arr[j] - median)) {
//                 res[p++] = arr[i++];
//             } else {
//                 res[p++] = arr[j--];
//             }
//         }
//         return res;
//     }
// }