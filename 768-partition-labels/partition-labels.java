class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
       
        int[] eIdx = new int[26];

        

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a';
            eIdx[value] = i;
            
        }

        int si = 0;
        int ei = 0;
        int max = 0;
        int sPoint = 0;

        while (si < s.length()) {
            if (eIdx[s.charAt(ei) - 'a'] > max) {
                max = eIdx[s.charAt(ei) - 'a'];
            }
            if (si == max) {
                list.add(max - sPoint + 1);
                sPoint = si + 1;
            }
            ei++;
            if (ei == s.length()) {
                break;
            }
            if (si == ei) {
                ei++;
            }
            si++;
        }

        return list;
    }
}