class Solution {
public static List<Integer> partitionLabels(String s) {
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int[] eIdx = new int[27];
        int j = 0;
        
        for (int i = 0; i < ch.length; i++) {
            int value = ch[i] - 97;
            eIdx[value] = i;
        }
        
        int sPoint = 0;
        int max = 0;
        
        for (int i = 0; i < ch.length; i++) {
            int value = ch[i] - 97;
            if (eIdx[value] > max) {
                max = eIdx[value];
            }
            if (i == max) {
                list.add(max - sPoint + 1);
                sPoint = i + 1;
            }
        }
        
        return list;
    }
}