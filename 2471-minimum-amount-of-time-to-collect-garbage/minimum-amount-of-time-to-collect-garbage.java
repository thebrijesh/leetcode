class Solution {
public static int garbageCollection(String[] garbage, int[] travel) {
        int g = 0, p = 0, m = 0;
        for (String s : garbage) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'G') g++;
                else if (s.charAt(j) == 'P') p++;
                else if (s.charAt(j) == 'M') m++;
            }
        }
        int count = 0;
        int k = 0;
        int G = 0, P = 0, M = 0;
        for (String s : garbage) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'G') {
                    G++;
                    count += 1;

                } else if (s.charAt(j) == 'P') {
                    P++;
                    count += 1;

                } else if (s.charAt(j) == 'M') {
                    M++;
                    count += 1;

                }

            }
            if (k < travel.length) {
                g -= G;
                p -= P;
                m -= M;
                if (g > 0) {
                    count += travel[k];
                    G = 0;
                }
                if (p > 0) {
                    count += travel[k];
                    P = 0;
                }
                if (m > 0) {
                    count += travel[k];
                    M = 0;
                }
                k++;
            }


        }
        return count;
    }
}