class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = s.length()-1;
        int i = t.length()-1;
        
        while(j>=0 && i>=0)
        {
            if(s.charAt(j) == t.charAt(i))
            {
                i--;
                j--;
            }
            else
                i--;
        }
        if(j<0)
            return true;
        else
            return false;
        
        /*//dp solution
        boolean dp[][] = new boolean[len1+1][len2+1];
        //initialization
        for(int i=0; i<len2; i++)
            dp[0][i] = false;  //if t is null not possible
        for(int i=0; i<len1; i++)
            dp[i][0] = true;   //if s is null always true
        
        for(int i=1; i<len1; i++)
        {
            for(int j=1; j<len2; j++)
            {
                if(t.charAt(i-1) == s.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[len1][len2];
        */
    }
    
}