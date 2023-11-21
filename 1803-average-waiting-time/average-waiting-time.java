class Solution {
public static double averageWaitingTime(int[][] nums) {
        int arriveTime = nums[0][0];
        double finishTime = nums[0][0] + nums[0][1];
        double waitingTime = nums[0][1];

        for (int i = 1; i < nums.length; i++) {
            arriveTime = nums[i][0];
            if (arriveTime > finishTime) {
                finishTime = nums[i][0] + nums[i][1];
            } else {
                finishTime += nums[i][1];
            }

            waitingTime += finishTime - arriveTime;

        }
        return  waitingTime /  nums.length;
    }
}