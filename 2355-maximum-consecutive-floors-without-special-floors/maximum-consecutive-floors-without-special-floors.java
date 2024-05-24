class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = 0;
        max = Math.max(max,Math.abs(bottom - special[0]));
         max = Math.max(max,Math.abs(top - special[special.length-1]));
        for(int i = 1; i < special.length; i++){
            max = Math.max((special[i] - special[i-1])-1,max);
        }
return max;
    }
}