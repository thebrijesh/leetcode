class Solution {
    public boolean validMountainArray(int[] arr)  {
        int a = 0;
        int b = 0;
        int flag = 0;
        int flag1 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && flag == 0) {
                a++;
            } else if (arr[i] < arr[i - 1] && flag1 == 0) {
                b++;
                flag = 1;
            } else {
                return false;
            }
        }
        if(a==0 || b ==0){
            return false;
        }
        if (a + b +1 == arr.length) {
            return true;
        }

        return false;
    }
}