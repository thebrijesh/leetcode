class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] ans = new int[k];

        for(int i = 0; i < arr.length; i++){
            int mod = arr[i] % k;
            if(mod < 0)mod = mod + k;
            ans[mod]++;
        }

        for(int i = 1; i <= ans.length/2; i++){
            if(ans[0] % 2 != 0)return false;
            if(ans[i] != ans[ans.length-i])return false;
        }

        return true;
    }
}