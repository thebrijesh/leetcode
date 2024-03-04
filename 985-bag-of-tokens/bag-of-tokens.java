class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int max = 0;
        int i = 0;
        int j = tokens.length - 1;
        boolean iliya = false;
        boolean jliya = false;
        while (i <= j) {
            if (tokens[i] <= power) {
                score++;
                power -= tokens[i];

            } else {
                if (score >= 1) {
                    score--;
                    power += tokens[j--];
                    i--;
                }

            }
            i++;
            max = Math.max(max, score);
        }
        return max;
    }
}