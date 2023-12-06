class Solution {
public static List<String> simplifiedFractions(int n) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Float> list1 = new ArrayList<>();
        float ans = 0.0F;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                ans = (float)i / j;
                if (i / j < 1 && !list1.contains(ans)){
                    list.add(String.valueOf(i)+ "/"+String.valueOf(j));

                    list1.add(ans);
                }
            }

        }
        return list;
    }

}