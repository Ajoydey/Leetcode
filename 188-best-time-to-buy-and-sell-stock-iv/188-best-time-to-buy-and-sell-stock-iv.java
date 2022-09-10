class Solution {
    public int maxProfit(int k, int[] prices) {
        int dp[][][] = new int[2][k+1][prices.length];
        for(int i=0; i<=1; i++)
            for(int j=0; j<=k; j++)
                for(int k1=0; k1<prices.length; k1++)
                    dp[i][j][k1] = -1;
        return Profit(prices, k, 0, 0, dp);
    }
    
    public int Profit(int[] prices, int k, int n, int buy, int[][][] dp)
    {
        //base case
        if(k==0 || n==prices.length)
            return 0;
        if(dp[buy][k][n] != -1)
            return dp[buy][k][n];
        if(buy==1)  //stock has been bought 2 choices sell or do nothing
        return dp[buy][k][n] = Math.max(prices[n] + Profit(prices, k-1, n+1, 0, dp), Profit(prices, k, n+1, buy, dp));
        
        else  //stock has not been bought 2 choices buy or do nothing
        return dp[buy][k][n] = Math.max(-prices[n] + Profit(prices, k, n+1, 1, dp), Profit(prices, k, n+1, buy, dp));
        
    }
}