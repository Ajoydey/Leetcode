class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n, dp);
    }
    public int solve(int n, int[] dp)
    {
        // We will try every possibility and return the minimum of all these. Suppose we are given 12.          Then we'll try all combinations with 1, 4, 9 and make a recursion call for 12-1, 12-4, 12-9             in all three respective cases and return minimum of all them
        if(n == 0)
        {
            return 0;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1;i <= (int)Math.sqrt(n); i++)
        {
            ans = Math.min(ans, 1+solve(n-i*i, dp));
        }
        return dp[n] = ans;
    }
}