class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            count = Math.max(count, dfs(bombs, new boolean[n], i, n));
        }
        return count;
    }
    
    public int dfs(int[][] bombs, boolean[] vis, int curr_bomb, int n)
    {
        if(vis[curr_bomb])
            return 0;
        
        vis[curr_bomb] = true;
        int count = 1;
        for(int i=0; i<n; i++)
        {
            if(vis[i])
                continue;
            if(willBurst(bombs, curr_bomb, i))
                count += dfs(bombs, vis, i, n);
        }
        return count;
    }
    public boolean willBurst(int[][] bombs, int i, int j)
    {
        double x_sqr = Math.pow((bombs[i][0]-bombs[j][0]),2);
        double y_sqr = Math.pow((bombs[i][1]-bombs[j][1]),2);
        
        return Math.pow(bombs[i][2],2) >= (x_sqr+y_sqr);
    }
}