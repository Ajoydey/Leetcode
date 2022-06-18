class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        for(int i=0; i<cost.length; i++)
            dp[i] = -1;
        return Math.min(minCostClimbing(cost, 0, dp), minCostClimbing(cost,1, dp));
    }
    public int minCostClimbing(int[] cost, int n, int[] dp)
    {
        if(n>=cost.length)
            return 0;
        else if(dp[n] != -1)
            return dp[n];
        return dp[n] = Math.min(cost[n]+minCostClimbing(cost,n+1,dp),cost[n]+minCostClimbing(cost,n+2,dp));
    }
}