class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix[0].length;
        int[][] dp=new int[n][n];
        for(int i=0; i<n; i++)
            dp[n-1][i]=matrix[n-1][i];  //initialization because last elements has to be the last level cost
        for(int i = n-2; i>=0; i--)
        {
            for(int j = n-1; j>=0; j--)
            {
                int sum1 = Integer.MAX_VALUE, sum2 = Integer.MAX_VALUE, sum3 = Integer.MAX_VALUE;
                if((j-1)>=0)
                    sum1 = matrix[i][j] + dp[i+1][j-1];
                if((j+1)<n)
                    sum3 = matrix[i][j] + dp[i+1][j+1];
                sum2 = matrix[i][j] + dp[i+1][j];
                dp[i][j] = Math.min(Math.min(sum1,sum2),sum3);
            }
        }
        int min_sum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
            min_sum = Math.min(dp[0][i], min_sum);
        return min_sum;
    }
}