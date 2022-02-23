class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+2];
        dp[0] = 0; dp[1] = 0;   //0 for -1 and 1 for 0
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = Math.max(nums[i-2]+dp[i-2] , dp[i-1]);
        }
        return dp[dp.length-1];
    }
    public int rob(int[] nums, int n)
    {
        if(n==0 || n==-1)
            return 0;
        return Math.max(nums[n-1]+rob(nums, n-2) , rob(nums, n-1));
    }
}