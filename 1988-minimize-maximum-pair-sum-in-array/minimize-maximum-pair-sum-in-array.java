class Solution {
    public int minPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(var no : nums){
            max = Math.max(max, no);
        }
        int[] arr = new int[max+1];

        for(var no : nums){
            arr[no]++;
        }

        int left = 0;
        int right = max;
        int sum = 0;

        while(left <= right){
            if(arr[left] == 0)left++;
            if(arr[right] == 0)right--;

            sum = Math.max(sum,left + right);

            if(arr[left] > arr[right]){
                arr[left] -= arr[right]; 
                right--;
            }else if(arr[left] < arr[right]){
                arr[right] -= arr[left];
                left++;
            }else{
                left++;
                right--;
            }


        }
        return sum;
    }
}