class Solution {
    public int numIslands(char[][] grid) {
        
        int count=0;
        for(int row=0; row<grid.length; row++)
        {
            for(int col=0; col<grid[0].length; col++)
            {
                if(grid[row][col] == '1')
                {
                    dfs(grid, row, col);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int row, int col)
    {
        //base case
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col] == '0')
            return;
        
        grid[row][col] = '0';
        
        //check neighbours
        
        dfs(grid, row, col-1);
        dfs(grid, row-1, col);
        dfs(grid, row+1, col);
        dfs(grid, row, col+1);
        return;
    }
}