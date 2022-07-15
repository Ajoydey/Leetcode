class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       int ans = 0;
        for(int row=0; row<grid.length; row++)
        {
            for(int col=0; col<grid[0].length; col++)
            {
                ans = Math.max(ans, solve(grid, row, col));
            }
        }
        return ans;
    }
    public int solve(int[][] grid, int row, int col){
        
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] == 0)
            return 0;
        
        grid[row][col] = 0;  //changing island to water to avoid multiple counting
        
        return 1+solve(grid, row, col-1)+solve(grid, row-1, col)+solve(grid, row+1, col)+solve(grid, row, col+1);
    }
}