class Solution {
    public int maxProfit(int[] prices) {
        int dp[][] = new int[2][prices.length];
        for(int i=0; i<=1; i++)
            for(int j=0; j<prices.length; j++)
                dp[i][j] = -1;
        return Profit(prices,0, 0, dp);
    }
    
    public int Profit(int prices[], int n, int buy, int dp[][])
    {
        if(n>=prices.length)
            return 0;
        if(dp[buy][n] != -1)
            return dp[buy][n];
        if(buy == 1) //bought can be sold or no action
            return dp[buy][n] = Math.max(prices[n]+Profit(prices, n+2, 0, dp), Profit(prices, n+1, 1, dp));
        else  //no bought can be bought or no action
            return dp[buy][n] = Math.max(-prices[n]+Profit(prices, n+1, 1, dp), Profit(prices, n+1, 0, dp));
    }
}