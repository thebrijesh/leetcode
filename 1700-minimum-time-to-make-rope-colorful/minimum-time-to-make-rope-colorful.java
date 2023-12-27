class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] ch = colors.toCharArray();
        int min = Integer.MAX_VALUE;
        int totalTime = 0;
        char check = ch[0];
        int max = 0;
        for(int i = 0; i < ch.length-1; i++){
            if(ch[i] == ch[i+1]){
                totalTime += Math.min(neededTime[i],neededTime[i+1]);
               
                neededTime[i+1] = Math.max(neededTime[i+1],neededTime[i]);
                

            }
        }
        return totalTime;
    }
}