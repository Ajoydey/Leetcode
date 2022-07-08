class Solution {
    int max_len = 1;
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int res = LIS(nums, nums.length, dp);
        return max_len;
    }
    public int LIS(int[] nums, int n, int[] dp){
        
        if(n==1)
            return 1;
        if(dp[n-1] != -1)
            return dp[n-1];
        int curr_len = 1;
        for(int i=1; i<n; i++)
        {
            int res = LIS(nums, i, dp);
            if(nums[n-1]>nums[i-1])
                curr_len = Math.max(res+1, curr_len);
                
        }
        max_len = Math.max(max_len, curr_len);
        
        return dp[n-1] = curr_len;
    }
}