class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int[] i: dp)
            Arrays.fill(i, -1);
        
        return solve(s1, s2, s1.length(), s2.length(), dp);
    }
    public int solve(String s1, String s2, int m, int n, int[][] dp){
        if(m==0 && n==0) //if both strings are empty no need of any operation
            return 0;
        
        if(m==0 || n==0) //if one of the string is empty I need to delete all the characters of 2nd string
        {
            int cost = 0;
            while(m >0)//if string 1 is not empty
            {
                cost += (int)s1.charAt(m-1);
                m--;
            }
            while(n >0)  //if string 2 is not empty
            {
                cost += (int)s2.charAt(n-1);
                n--;
            }
            
            return cost;
        }
        
        if(dp[m][n] != -1)
            return dp[m][n];
        
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return dp[m][n] = solve(s1, s2, m-1, n-1, dp);
        
        else
        {
            int deleteFirst = (int)s1.charAt(m-1) + solve(s1, s2, m-1, n, dp); //delete a character from 1st string
            int deleteSecond = (int)s2.charAt(n-1) + solve(s1, s2, m, n-1, dp); //delete a character from 2nd string
            return dp[m][n] = Math.min(deleteFirst, deleteSecond);
        }
    }
}