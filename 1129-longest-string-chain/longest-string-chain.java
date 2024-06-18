class Solution {
    public class mwords {
        int n;
        String str;

        mwords(int n, String str) {
            this.n = n;
            this.str = str;
        }
    }

    public int longestStrChain(String[] words) {
        mwords[] arr = new mwords[words.length];
        int idx = 0;
        for (String s : words) {
            arr[idx++] = new mwords(s.length(), s);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a.n, b.n));
        for (int i = 0; i < arr.length; i++) {
            words[i] = arr[i].str;
        }

        int[] array = new int[words.length];
        Arrays.fill(array,1);
        int max = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j <= i; j++){
                if(words[j].length() +1  == words[i].length()){
                    if(isPred(words[j],words[i])){
                        array[i] = Math.max(array[i],array[j]+1);
                    }
                    
                }
            }

            max = Math.max(array[i],max);
        }
        return max;

    }

    
    public boolean isPred(String str1, String str2) {
        int n = str2.length();
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (str1.charAt(i) != str2.charAt(j)) {
                j++;
            } else if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }

            if (i == str1.length())
                return true;
        }
        return false;
    }
}