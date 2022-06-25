class Solution {
    public boolean canWinNim(int n) {
        return n%4==0 ? false : true;
        /*
            if(n<4) {
                return true;
            }
            if(n==4) {
                return false;
            }
            boolean[] dp=new boolean[n+1];
            for(int i=1;i<=n;i++) {
                if(i<4) {
                    dp[i]=true;
                }
                else {
                    boolean ans1=dp[i-1], ans2=dp[i-2], ans3=dp[i-3];
                    dp[i]=!(ans1 && ans2 && ans3);
                }
            }
            return dp[n];
        */
    }
}