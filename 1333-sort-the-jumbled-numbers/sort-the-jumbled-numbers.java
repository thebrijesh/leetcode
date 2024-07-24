class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] temp1 = new int[nums.length][2];
        int j = 0;
        for(int i : nums){
            temp1[j++][0] = i;
        }

        Arrays.sort(temp1,new Comparator<int[]>(){
            public int compare(int[] a , int[] b){
                int a1 = 0; int d = 1;
                int a11 = a[0];
               do{
                    a1 = a1   + ((mapping[a11 % 10]) * d);
                    d *= 10;
                    a11 /= 10;
                } while(a11 != 0);
                int b1 = 0; d = 1;
                int b11 = b[0];
               do {
                    b1 = b1   + ((mapping[b11 % 10]) * d);
                    d *= 10;
                    b11 /= 10;
                }while(b11 != 0);
                return a1 - b1;
            }
        });
        for(int i=0; i<nums.length; i++){
            nums[i] = temp1[i][0];
        }
        return nums;
    }
}