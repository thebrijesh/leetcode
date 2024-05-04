class Solution {
  
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int output = 0;
        int store = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            store = prices[i] - min;
            if(output < store){
                output = store;
            }
        }
        return output;
    }

}