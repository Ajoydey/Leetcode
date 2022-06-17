class Solution {
    public int maxProfit(int[] prices) {
        // for memoization
        int dp[][][] = new int[2][3][prices.length];  //1st one for buy, 2nd for no of transactions, 3rd array size
        for(int i=0; i<2; i++)
            for(int j=0; j<3; j++)
                for(int k=0; k<prices.length; k++)
                    dp[i][j][k] = -1;
        return Profit(prices, 2, 0, 0, dp);
        
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