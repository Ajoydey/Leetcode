class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int[] i: dp)
            Arrays.fill(i, -1);
        
        int ans = solve(coins, amount, coins.length, dp);
        if(ans<Integer.MAX_VALUE-1)
            return ans;
        else
            return -1;
    }
    public int solve(int[] coins, int amount, int n, int[][] dp){
        if(amount==0)
            return 0;
        if(n==0)
            return Integer.MAX_VALUE-1;
        
        if(dp[n][amount] != -1)
            return dp[n][amount];
        
        if(coins[n-1]<=amount) //two choices
            return dp[n][amount] = Math.min(1 + solve(coins, amount-coins[n-1], n, dp), solve(coins, amount, n-1, dp));
        
        else
            return dp[n][amount] = solve(coins, amount, n-1, dp);
                                                
    }
}