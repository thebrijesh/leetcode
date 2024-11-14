class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int start = 1;
        int end = Integer.MAX_VALUE;

        int mid = 0;
        int m = quantities.length;

        while(start < end){
            mid = start + (end - start)/2;
            int stores = 0;
            for(int product : quantities){
                stores +=  (product + mid-1)/mid;
                

            }
            if(stores <= n){
                end = mid;
            }else{
                start = mid +1;
            }
        }


        return start;
    }
}