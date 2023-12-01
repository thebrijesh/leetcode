class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        int k = 0; int j = 0;
        
            while(j < word1.length){
                str.append(word1[j++]);
                while(k < word2.length){
                    str1.append(word2[k++]);
              
                }
              
            }
    
        
       return str.toString().equals(str1.toString());
        
    }
}