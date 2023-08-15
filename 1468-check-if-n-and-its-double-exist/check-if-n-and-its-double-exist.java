class Solution {
   public static boolean checkIfExist(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i !=j){
                        int multi = 2 * arr[j];
                        if (multi == arr[i]){
                           return true;
                        }
                    }
                }

        }
return false;
    }
}