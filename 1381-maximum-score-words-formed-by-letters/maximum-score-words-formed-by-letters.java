class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        if (words == null || words.length == 0 || letters == null || 
        letters.length == 0 || score == null || score.length == 0) return 0;
        int[] farr = new int[score.length];
        for (char ch : letters) {
            farr[ch - 'a']++;
        }

        return helper(words,farr, score, 0);
    }

    public int helper(String[] words, int[] farr, int[] score, int idx){
        if(idx == words.length){
            return 0;
        }

        int sno = helper(words,farr,score,idx +1); // not included

        // include
        int sword = 0;
        String word = words[idx];
        boolean flag = true;
    
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(farr[ch-'a'] == 0){
                flag = false;
            }

            farr[ch-'a']--;
            sword += score[ch - 'a'];
        }
        int syes = 0;
        if(flag){
            syes = sword + helper(words, farr, score, idx +1);
        }

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            farr[ch - 'a']++;
        }
        return Math.max(sno,syes);
    }
}