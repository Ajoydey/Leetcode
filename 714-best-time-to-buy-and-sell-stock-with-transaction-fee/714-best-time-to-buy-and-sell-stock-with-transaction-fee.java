class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[2][prices.length+1];
        for(int[] i: dp)
            Arrays.fill(i, Integer.MIN_VALUE);
        return solve(prices, 0, 0, fee, dp);
    }
    
    public int solve(int[] prices, int i, int buy, int fee, int[][] dp)
    {
        if(i==prices.length)
            return 0;
        if(dp[buy][i] != Integer.MIN_VALUE)
            return dp[buy][i];
        
        if(buy == 0) //not bought 2 choices can buy or skip
            return dp[buy][i] = Math.max(-prices[i]+solve(prices, i+1, 1, fee, dp), solve(prices, i+1, 0, fee, dp));
        
        else  //bought either sell or skip
            return dp[buy][i] = Math.max(prices[i]-fee+solve(prices, i+1, 0, fee, dp), solve(prices, i+1, 1, fee, dp));
    }
}