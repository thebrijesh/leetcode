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
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans= new ArrayList<>();
        int i=1, j=1000;
        while(i<=1000 && j>=1){
            int res= customfunction.f(i,j);
            if(res==z){
                List<Integer> list= new ArrayList<>();
                list.add(i);
                list.add(j);
                ans.add(list);
                i++;
                j--;
            }else if(res>z){
                j--;
            }else if(res<z){
                i++;
            }
        }

        return ans;
    }
}