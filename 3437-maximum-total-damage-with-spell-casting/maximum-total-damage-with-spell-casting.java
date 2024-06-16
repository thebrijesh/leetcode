class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public long maximumTotalDamage(int[] power) {
        int n = power.length;
        //store frequency of each el
        for(int el :power) {
            map.put(el, map.getOrDefault(el, 0)+1);
        } 
        //sort arr, so that we don't have to look for el-1, el-2 (will take elements in increasing order)
        Arrays.sort(power);
        //intialise dp
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        return find(power, n, 0, dp);
    }
    public long find(int[] power, int n , int idx, long[] dp) {
        if(idx >= n) return 0;
        if(dp[idx+1] != -1) return dp[idx+1];
        //skip
        long skip = find(power, n, idx+1, dp);
        //find next index using bSearch
        int nextIdx = bSearch(power, idx+1, n-1, power[idx]+3);
        //for repeated elements we must take all occurences in order to get max sum, therefor el*(frequency)
        long take = (power[idx]*(long)map.get(power[idx])) + find(power, n, nextIdx, dp);
        
        return dp[idx+1] = Math.max(take, skip);
    }
    //binary search to find next takeable index
    public int bSearch(int[] arr, int s, int e, int val) {
        int ans = arr.length;
        while(s <= e) {
            int m = s+(e-s)/2;
            if(arr[m] >= val) {
                e = m-1;
                ans = m;
            }else s = m+1;
        }
        return ans;
    }
}