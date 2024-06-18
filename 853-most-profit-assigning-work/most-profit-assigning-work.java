class Solution {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[] arr = new int[100001];
        int max = 0;
        for (int i = 0; i < difficulty.length; i++) {

            arr[difficulty[i]] = Math.max(arr[difficulty[i]], profit[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            arr[i] = max;
        }
        int ans = 0;

        for (int i = 0; i < worker.length; i++) {
            ans += arr[worker[i]];
        }

        return ans;
    }
}