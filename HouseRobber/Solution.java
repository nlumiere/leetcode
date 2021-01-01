class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        else if(nums.length == 1){
            return nums[0];
        }
        int dp1 = nums[0];
        int dp2 = Math.max(nums[0], nums[1]);
        for(int ii = 2; ii < nums.length; ii++){
            int temp = Math.max(dp1+nums[ii], dp2);
            dp1 = dp2;
            dp2 = temp;
        }
        
        return dp2;
    }
}