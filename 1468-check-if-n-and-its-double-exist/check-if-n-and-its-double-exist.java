class Solution {

     public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : arr) {
            if (num % 2 == 0) {
                if (map.containsKey(num * 2) || map.containsKey(num / 2)) {
                    return true;
                } else {
                    map.put(num, 1);
                }

            }else {
                if (map.containsKey(num * 2)){
                    return true;
                }else{
                    map.put(num,1);
                }
            }

        }
        return false;
    }
}