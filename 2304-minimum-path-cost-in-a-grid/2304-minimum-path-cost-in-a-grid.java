class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        //For each row transition we choose the minimum cost except 2nd last to last row transition
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        
        for(int j=0; j<col; j++)
        {
            dp[0][j] = grid[0][j];
        }
        for(int i=1; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                int min_cost = Integer.MAX_VALUE;
                for(int k=0; k<col; k++)
                {
                    
                    if(min_cost>grid[i][j]+dp[i-1][k]+moveCost[grid[i-1][k]][j])
                    {
                        min_cost = grid[i][j]+dp[i-1][k]+moveCost[grid[i-1][k]][j];
                        
                    }
                    dp[i][j] = min_cost;
                }
            }
        }
        int mincost = Integer.MAX_VALUE;
        for(int j=0; j<col; j++)
            mincost = Math.min(mincost, dp[row-1][j]);
        
        return mincost;
        
    }
}