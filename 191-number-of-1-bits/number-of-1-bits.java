public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        int zcount = 0;
        int i = 0;
        int ans = 0;
       long k = n;
        if (n < 0) {
            long m = Math.abs(k);
            while (m > 0) {
                

                if (m % 2 == 1) {
                    count++;
                }
                if (count >= 1 && m % 2 == 0) zcount++;

                m /= 2;
                i++;
            }
            ans = (33 - i) + zcount;
            
            return ans;
        } else {
            while (n > 0) {
                
                if (n % 2 == 1) count++;
                n /= 2;
            }
        }


        return count;
    }
   
}