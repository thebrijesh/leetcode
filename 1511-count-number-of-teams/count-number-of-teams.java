class Solution {
    public int numTeams(int[] rating) {
        int ans = 0;
        for(int j = 1; j < rating.length-1; j++){

            int countSmallestLeft =0;
            int countLargestLeft = 0;
            int countSmallestRight = 0;
            int countLargestRight = 0;

            for(int i = 0; i < j; i++){
                if(rating[i] < rating[j]){
                    countSmallestLeft++;
                }else{
                    countLargestLeft++;
                }
            }

            for(int k = j+1; k < rating.length; k++){
                if(rating[k] < rating[j]){
                    countSmallestRight++;
                }else{
                    countLargestRight++;
                }
            }

            ans += (countSmallestLeft * countLargestRight) + (countLargestLeft * countSmallestRight );
        }

        return ans;
    }

}