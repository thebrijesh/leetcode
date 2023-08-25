class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int count = 1;
        for(int i =0; i < candyType.length-1; i++){
            if(candyType[i] < candyType[i+1] && count < (candyType.length)/2){
                            count++;
            }
        }
        return count;
    }
}