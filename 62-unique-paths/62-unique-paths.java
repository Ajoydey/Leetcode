class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0) //base case if in 0th row or 0th column only 1 way of reaching
                    dp[i][j] = 1;
                else
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                
            }
        }
        return dp[m-1][n-1];
    }
}