class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;
        int n = arr.length;
        int xor = 0;
        
        for (int i = 0; i < n; i++) {
            xor = 0;
            for (int j = i ; j < n; j++) {
                xor ^= arr[j];
                if(xor == 0){
                    count += (j-i);
                }

                
            }
        }
        
        return count;
    }
}