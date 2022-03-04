class Solution {
    public int maxProfit(int[] prices) {
        //brute force
        int min_so_far = prices[0];
        int max_profit = 0;
        for(int i=0; i<prices.length; i++)
        {
            min_so_far = Math.min(min_so_far, prices[i]);  //storing the min price before ith day
            
            int profit = prices[i] - min_so_far;  //trying to sell on each day
            
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
    }
}