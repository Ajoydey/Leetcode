class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0; i<dp.length; i++)
            dp[i] = -1;
        return robSum(nums, 0, dp);
    }
    public int robSum(int nums[], int n, int dp[])
    {
        if(n>=nums.length)
            return 0;
        if(dp[n] != -1)
            return dp[n];
        return dp[n] = Math.max(nums[n]+robSum(nums, n+2, dp), robSum(nums, n+1, dp));
    }
        
}