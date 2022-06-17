class Solution {
    public int rob(int[] nums) {
        //either 0 to n-2 or 1 to n-1
        if(nums.length == 1)
            return nums[0];
        return Math.max(robTemp(nums, 0, nums.length-2), robTemp(nums,1,nums.length-1));
    }
    public int robTemp(int[] nums, int start, int end) {
        
        //dynamic programming
        
        int dp[] = new int[nums.length+1];
        dp[0] = 0; dp[1] = 0;   //0 for -1 and 1 for 0
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = Math.max(nums[i+start-2]+dp[i-2] , dp[i-1]);
        }
        return dp[dp.length-1];
    }
}