class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // Calculate the total sum of chalk requirements
        long totalChalk = 0;
        for (int i = 0; i < chalk.length; i++) {
            totalChalk += chalk[i];
        }
        
        // Reduce k by the total sum of chalk to find the remainder
        k %= totalChalk;

        // Find the student who will need to be replaced
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        
        // In case no student is found, return 0 (though this should never happen given the problem constraints)
        return 0;
    }
}
