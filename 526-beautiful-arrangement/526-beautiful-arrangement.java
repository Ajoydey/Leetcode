class Solution {
    int cnt=0;
    public int countArrangement(int n) {
        boolean[] vis=new boolean[n+1];
        dfs(n, 1, vis);
        return cnt;
    }
    public void dfs(int n, int curr, boolean[] vis) {
        if(curr>n) {
            cnt++;
            return ;
        }
        for(int i=1;i<=n;i++) {
            if(!vis[i] && (curr%i==0 || i%curr==0)) {
                vis[i]=true;
                dfs(n, curr+1, vis);
                vis[i]=false;
            }
        }
    }
}