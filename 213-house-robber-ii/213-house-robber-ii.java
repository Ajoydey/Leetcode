class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int n = nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans1 = solve(nums, 0, n-2, dp);
        Arrays.fill(dp, -1);
        int ans2 = solve(nums, 1, n-1, dp);
        return Math.max(ans1,ans2);
    }
    public int solve(int[] nums, int idx, int end, int[] dp)
    {
        if(idx>end)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        return dp[idx] = Math.max(nums[idx] + solve(nums, idx+2, end, dp), solve(nums, idx+1, end, dp));
    }
}