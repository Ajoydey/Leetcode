class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==n-1)
                    dp[i][j] = grid[i][j];  //initialization because last elements has to be the last level cost
                else
                    dp[i][j] = Integer.MAX_VALUE;  //for others initialising to max value
            }
        }
        for(int i = n-2; i>=0; i--)
        {
            for(int j = n-1; j>=0; j--)
            {
                
                for(int k =0; k<n; k++)
                {
                    if(k != j)
                        dp[i][j] = Math.min((grid[i][j] + dp[i+1][k]), dp[i][j]);
                }
            }
        }
        int min_sum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
            min_sum = Math.min(dp[0][i], min_sum);
        return min_sum;
    }
}