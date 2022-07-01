class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        //checking if grid[0][0] is an obstale, no solution then
        if(obstacleGrid[0][0] == 1)
            return 0;
        int[][] dp = new int[row][col];
        for(int[] rows: dp)
            Arrays.fill(rows, -1);
        return paths(obstacleGrid, row-1, col-1, dp);
    }
    public int paths(int[][] grid, int m, int n, int[][] dp){
        if(m==0 && n==0) //success
            return 1;
        
        if(m<0 || n<0 || grid[m][n] ==1)//checking for row and column limits and obstacle 
            return 0;
        if(dp[m][n] != -1)
            return dp[m][n];
        
        return dp[m][n] = paths(grid, m-1, n, dp) + paths(grid, m, n-1, dp);
    } 
    
}