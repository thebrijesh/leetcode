class Solution {
    public long countVowels(String word) {
        char[] ch = word.toCharArray();
        long ans  = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'a' ||ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u'  ){
                long val = ch.length - i ;
                ans += val * (i+1);
            }
            

        }
        return ans;
    }
}