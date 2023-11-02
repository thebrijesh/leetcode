class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
       
        for(int i = 0; i < l.length; i++){
            int j = l[i];
            int k = r[i];
            int m = 0;
            int[] temp = new int[r[i] - l[i] + 1]; 
            while(j <= k){
                temp[m++] = nums[j++];

            }
            Arrays.sort(temp);
            int diff = temp[1] - temp[0];
            boolean flag = false;
            for(int o = 1; o < temp.length; o++){
                if(diff != temp[o] - temp[o-1]){
                    flag = !flag;
                    break;
                }
            }
            if(flag) list.add(false);
            else list.add(true);
        }
        return list;
    }
}