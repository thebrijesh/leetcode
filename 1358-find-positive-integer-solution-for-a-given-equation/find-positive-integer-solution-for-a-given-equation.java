/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {

    public static int binarySearch1(CustomFunction customfunction, int i, int z){
        int start = 1;
        int end = 1000;
        int ans = 1001;
        while (start <= end) {
            int fmid = start + (end - start) / 2;
            if (customfunction.f(i,fmid) == z) {
                ans = fmid;
                end = fmid - 1;
            } else if (customfunction.f(i,fmid) < z) {
                start = fmid + 1;
            }else {
                end = fmid - 1;
            }
        }
        return ans;
    }

    public static int binarySearch2(CustomFunction customfunction, int i, int z){
        int start = 1;
        int end = 1000;
        int ans = 0;
        while (start <= end) {
            int fmid = start + (end - start) / 2;
            if (customfunction.f(i,fmid) == z) {
                ans = fmid;
                start = fmid + 1;
            } else if (customfunction.f(i,fmid) < z) {
                start = fmid + 1;
            }else {
                end = fmid - 1;
            }
        }
        return ans;
    }
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <=1000; i++){
            int start = binarySearch1(customfunction,i,z);
            int end = binarySearch2(customfunction,i,z);

            if(start <= end){
                for(int j = start; j <= end; j++){
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return list;
    }
}