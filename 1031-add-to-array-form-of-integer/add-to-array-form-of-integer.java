class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int ans = 0; int carry = 0;
        for(int i = nums.length-1; i >= 0; i--){
            ans = (k % 10) + carry;

            k = k /10;
            if(9 >= ans + nums[i]){
                nums[i] += ans;
                carry = 0;
            }else{
                carry = (ans + nums[i]) / 10;
                nums[i] = (ans + nums[i]) % 10;
                
            }

        }
        while(k != 0){

            ans = (k%10) + carry;
            k = k / 10;
            if(9 >= ans){
                list.add(0,ans);
                carry = 0;
            }else{
                carry = (ans ) / 10;
                list.add(0,ans % 10);
                
            }
        }
        if(carry > 0){
            list.add(0,carry);
        }
        for(int i = 0; i < nums.length; i++){
            
            list.add(nums[i]);
        }
        return list;
    }
}