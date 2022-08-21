class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int[] i: dp)
            Arrays.fill(i, -1);
        return solve(word1, word2, word1.length(), word2.length(), dp);
    }
    public int solve(String word1, String word2, int m, int n, int[][] dp){
        if(m==0 && n==0) //if both strings are empty no need of any operation
            return 0;
        
        if(m==0 || n==0) //if one of the string is empty I need to delete all the characters of 2nd string
            return m==0 ? n:m;
        
        if(dp[m][n] != -1)
            return dp[m][n];
        
        if(word1.charAt(m-1) == word2.charAt(n-1))
            return dp[m][n] = solve(word1, word2, m-1, n-1, dp);
        
        else
        {
            int deleteFirst = solve(word1, word2, m-1, n, dp); //delete a character from 1st string
            int deleteSecond = solve(word1, word2, m, n-1, dp); //delete a character from 2nd string
            return dp[m][n] = 1 + Math.min(deleteFirst, deleteSecond);
        }
    }
}