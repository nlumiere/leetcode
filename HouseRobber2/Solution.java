class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        } else if(nums.length == 1){
            return nums[0];
        } else if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int dp1_1 = nums[0];
        int dp1_2 = Math.max(nums[0], nums[1]);
        int dp2_1 = nums[1];
        int dp2_2 = Math.max(nums[1], nums[2]);
        int temp1;
        int temp2;
        for(int ii = 3; ii < nums.length; ii++){
            temp1 = Math.max(dp1_1 + nums[ii-1], dp1_2);
            dp1_1 = dp1_2;
            dp1_2 = temp1;
            temp2 = Math.max(dp2_1 + nums[ii], dp2_2);
            dp2_1 = dp2_2;
            dp2_2 = temp2;
        }
        return Math.max(dp1_2, dp2_2);
    }
}