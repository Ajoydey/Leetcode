class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++)
        {
            if(!vis[i])
            {
                dfs(isConnected, vis, i, n);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][] isConnected, boolean[] vis, int prov, int n)
    {
        if(vis[prov])
            return;
        vis[prov] = true;
        
        for(int i=0; i<n; i++)
        {
            if(isConnected[prov][i] == 1)
                dfs(isConnected, vis, i, n);
        }
    }
}