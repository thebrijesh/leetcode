class Solution {
    public boolean stoneGame(int[] piles) {
        int even = 0;
        int odd = 0;

        for(int i = 0; i < piles.length; i++){
            if(i % 2 == 0){
                even += piles[i];
            }else{
                odd += piles[i];
            }
        }

        
        return true;
    }
}