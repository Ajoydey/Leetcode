class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] dp = new int[m][n];
        for(int[] rows: dp)
            Arrays.fill(rows, -1);
        return paths(grid, m-1, n-1, dp);
    }
    public int paths(int[][] grid, int m, int n, int[][] dp){
        if(m==0 && n==0)
            return grid[m][n];
        if(m<0 || n<0)
            return Integer.MAX_VALUE;
        if(dp[m][n] != -1)
            return dp[m][n];
        
        return dp[m][n] = grid[m][n] + Math.min(paths(grid, m-1, n, dp), paths(grid, m, n-1, dp));
    }
}