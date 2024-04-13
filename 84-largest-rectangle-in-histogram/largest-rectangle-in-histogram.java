class Solution {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[height.length];

        for(int i = height.length-1; i >= 0; i--){
         while(!stack.isEmpty() && height[stack.peek()] >= height[i])stack.pop();
            if(!stack.isEmpty()){
               
                arr[i] = stack.peek();
                stack.push(i);
            }else{
                stack.push(i);
                arr[i] =height.length;
            }
        }
        int[] arr1 = new int[height.length];
        stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i < height.length; i++){
         while(!stack.isEmpty() && height[stack.peek()] >= height[i])stack.pop();
            if(!stack.isEmpty()){
               
                arr1[i] = stack.peek();
                stack.push(i);
            }else{
                stack.push(i);
                arr1[i] =-1;
            }
            ans = Math.max(ans,(Math.abs(((arr[i]-1) - (arr1[i]+1)+1))) * height[i] );
        }


        
        return ans;
    }
}