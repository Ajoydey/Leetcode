class Solution {
    public int maxProfit(int[] prices) {
        //dp solution
        // int[] dp = new int[prices.length];
        // dp[prices.length-1] = prices[prices.length-1];
        // int max_profit = Integer.MIN_VALUE;
        // for(int i=prices.length-2; i>=0; i--){
        //     dp[i] = Math.max(prices[i], dp[i+1]);
        //     max_profit = Math.max(max_profit, dp[i]-prices[i]);
        // }
        // return max_profit;
        
        //O(n) approach
        int min_so_far = prices[0];
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++)
        {
            profit = Math.max(profit, prices[i]-min_so_far);
            if(prices[i]<min_so_far)
                min_so_far = prices[i];
        }
        return profit;
    }
}