class Solution {
    public int minimumDeletions(String s) {
        int[] preB = new int[s.length()];
        int[] nextA = new int[s.length()];
        int bcount = 0;
        int acount = 0;
        int ans =Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i++){
            preB[i] = bcount;
            if(s.charAt(i) == 'b'){
                bcount++;
            }
            nextA[s.length()-i-1] = acount;
            if(s.charAt(s.length()-i-1)== 'a'){
                acount++;
            }
        }

        for(int i = 0; i < s.length(); i++){
            ans = Math.min(ans, preB[i] + nextA[i]);
        }
        return ans;

    }
}