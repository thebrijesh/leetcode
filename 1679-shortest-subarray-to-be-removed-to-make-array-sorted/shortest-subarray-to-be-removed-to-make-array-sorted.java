class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l+1 < arr.length && arr[l] <= arr[l + 1])
            l++;
        while (r-1 >= 0 && arr[r] >= arr[r - 1])
            r--;
        
        if(l >= r)return 0;

        int ans = r; int start = 0; int end = r;

        while(start <= l){
            while(end < arr.length && arr[end] < arr[start])end++;
            ans =  Math.min(ans, end - start -1);
            start++;
        }

        return ans;
    }
}