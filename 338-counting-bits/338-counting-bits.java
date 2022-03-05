class Solution {
    public int[] countBits(int n) {
        //dp solution
        int dp[] = new int[n+1];
        if(n==0)
        {
            dp[0] = 0;
            return dp;
        }
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=0; i<=n; i++)
            dp[i] = i%2 + dp[i/2];
        
        return dp;
    }
}