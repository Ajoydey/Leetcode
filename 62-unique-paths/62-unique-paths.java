class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] rows: dp)
            Arrays.fill(rows, -1);
        return paths(m-1, n-1, dp);
    }
    public int paths(int m, int n, int[][] dp){
        if(m==0 && n==0)
            return 1;
        if(m<0 || n<0)
            return 0;
        if(dp[m][n] != -1)
            return dp[m][n];
        
        return dp[m][n] = paths(m-1, n, dp) + paths(m, n-1, dp);
    }
}