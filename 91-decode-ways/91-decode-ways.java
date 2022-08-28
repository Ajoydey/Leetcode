class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s, 0, dp);
    }
    public int solve(String s, int i, int[] dp)
    {
        if(i>s.length()) return 0;
        
        if(i == s.length()) return 1;
        
        if(dp[i] != -1)
            return dp[i];
        
        char ch = s.charAt(i);
        if(ch == '0')
            return dp[i] = 0;
        else if(ch == '1')
            return dp[i] = solve(s, i+1, dp)+solve(s, i+2, dp);
        else if(ch == '2')
        {
            if((i+1) < s.length())
            {
                char temp = s.charAt(i+1);
                if(temp<='6')
                    return dp[i] = solve(s, i+1, dp)+solve(s, i+2, dp);
            }
            return dp[i] = solve(s, i+1, dp);
        }
        else
            return dp[i] = solve(s, i+1, dp);
    }
}