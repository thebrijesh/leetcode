class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        int k = 0;
        
            for(int j = 0; j < word1.length; j++){
                str.append(word1[j]);
                System.out.println(str.charAt(k++));
            }
        
        k = 0;
        
            for(int j = 0; j < word2.length; j++){
                str1.append(word2[j]);
                System.out.println(str1.charAt(k++));
            }
        
       return str.toString().equals(str1.toString());
        
    }
}