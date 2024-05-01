class Solution {
    public int maxArea(int[] height) {
        int ans =0;

        int li = 0;
        int ri = height.length-1;

        while(li < ri){
            int left = height[li];
            int right = height[ri];

            int area = Math.min(left,right) * (ri - li);
            ans = Math.max(ans,area);

            if(left < right){
                li++;
            }else{
                ri--;
            }
        }



        return ans;
    }
}