class Solution {
 public static List<String> simplifiedFractions(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (gcd(i, j) == 1) {
                    String s = "" + i + "/" + j;
                    l.add(s);
                }
            }
        }
        return l;
    }

    public static int gcd(int i, int j) {
        if (j == 0) return i;
        return gcd(j, i % j);
    }

}