class Solution {
  public static int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            int ans = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (i != j && boxes.charAt(j) == '1') {
                    ans += Math.abs(j - i);
                }
            }
            arr[i] = ans;
        }
        for (var num : arr) {
            System.out.println(num);
        }
        return arr;
    }
}