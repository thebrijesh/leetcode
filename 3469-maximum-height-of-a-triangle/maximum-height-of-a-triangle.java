class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        
       return Math.max(solve(red,blue,1,1),solve(red,blue,1,0));
        
    }

    public int solve(int red, int blue, int count, int flag){
        

        if(flag == 1 && blue - count >= 0){
            return solve(red, blue - count,count+1,0);
        }

        else if(flag == 0 && red - count >= 0){
           return  solve(red - count, blue, count+1,1);
        }else{
            return count-1;
        }

       
    }
}