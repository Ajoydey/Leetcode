class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int[] i: dp)
            Arrays.fill(i, -1);
        
        return solve(s, t, s.length(), t.length(), dp);
    }
    public int solve(String s, String t, int i, int j, int[][] dp)
    {
        if(i==0)  //if string s is empty two cases
        {
            if(j==0) //if string t is also empty valid case
                return 1;
            else
                return 0;
        }
        
        if(j==0)  //if string t is empty then I have encountered one such subsequence
            return 1;
        
        if(dp[i][j] != -1)
            return dp[i][j];
        
        if(s.charAt(i-1) == t.charAt(j-1)) //if character at that position is same I have two choice
            return dp[i][j] = solve(s, t, i-1, j-1, dp) + solve(s, t, i-1, j, dp);  //consider it or not consider
        
        else  //I cannot consider it
            return dp[i][j] = solve(s, t, i-1, j, dp);
    }
}