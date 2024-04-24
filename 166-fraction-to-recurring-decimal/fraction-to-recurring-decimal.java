class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        boolean isNegative = false;

        long numeratorL = Math.abs((long) numerator);
        long denominatorL = Math.abs((long) denominator);
        StringBuilder ans = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
            ans.append("-");
        }
        ;
        long q = numeratorL / denominatorL;
        long r = numeratorL % denominatorL;

        ans.append(Math.abs(q));

        if (r == 0) {
            return ans.toString();
        } else {
            ans.append(".");
            HashMap<Long, Integer> map = new HashMap<>();

            while (r != 0) {
                if (map.containsKey(r)) {
                    int len = map.get(r);
                    ans.insert(len, "(");
                    ans.append(")");
                    break;
                } else {
                    map.put(r, ans.length());
                    r *= 10;
                    q = r / denominatorL;
                    r = r % denominatorL;
                    ans.append(Math.abs(q));
                }
            }
        }

        return ans.toString();
    }
}