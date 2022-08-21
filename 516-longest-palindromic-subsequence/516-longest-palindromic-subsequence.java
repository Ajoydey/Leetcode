class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length()==1)
            return 1;
        String rev = "";
        for(int i=0; i<s.length(); i++)
            rev = s.charAt(i)+rev;
        
        int[][] lps = new int[s.length()+1][s.length()+1];
        
        for(int i=0; i<=s.length(); i++)
        {
            for(int j=0; j<=s.length(); j++)
            {
                if(i==0 || j==0)
                    lps[i][j] = 0;
                else
                {
                    if(s.charAt(i-1)==rev.charAt(j-1))
                        lps[i][j] = 1+lps[i-1][j-1];
                    else
                        lps[i][j] = Math.max(lps[i-1][j], lps[i][j-1]);
                }
            }
        }
        return lps[s.length()][s.length()];
    }
}