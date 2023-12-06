class Solution {
 public static List<String> simplifiedFractions(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcd(i, j) == 1) {
                    String s = "" + j + "/" + i;
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