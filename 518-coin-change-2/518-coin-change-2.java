class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        int n = coins.length;
        for(int j =0; j<=amount; j++)
            dp[0][j] = 0;
        for(int i=0; i<=n; i++)
            dp[i][0] = 1;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<=amount; j++)
            {
                if(coins[i-1]<=j)
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][amount];
    }
    public int solve(int[] coins, int amount, int n, int[][] dp){
        if(amount == 0)
            return 1;
        if(n == 0)
            return 0;
        
        if(n==1)
            return amount%coins[n-1] == 0 ? 1 : 0;
        
        if(dp[n][amount] != -1)
            return  dp[n][amount];
        
        if(coins[n-1]<=amount)
            return solve(coins, amount-coins[n-1], n, dp) + solve(coins, amount, n-1, dp);
        else
            return solve(coins, amount, n-1, dp);
    }
}