class Solution {
    public int deleteAndEarn(int[] nums) {
        //This problem can be reduced to house robber, once we delete one number, n-1 and n+1 are not available to us, so basically we cannot rob two conatiguos houses
        
        int max = Integer.MIN_VALUE;
        for(int i: nums)
            max =  Math.max(i, max);
        
        int rob[] = new int[max+1];   //0 to max
        
        for(int i: nums)
            rob[i]+=i;
        
        int dp[] = new int[rob.length+1];
        dp[0] = 0; dp[1] = rob[0];
        
        for(int i=2; i<=rob.length; i++)
        {
            dp[i] = Math.max(rob[i-1]+dp[i-2], dp[i-1]);
        }
        
        return dp[rob.length];
    }
}