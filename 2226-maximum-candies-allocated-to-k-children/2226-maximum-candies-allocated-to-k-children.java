class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        // base case
        long total_candies =0;
        for(int candy: candies)
            total_candies += candy;
        
        if(total_candies<k)
            return 0;
        
        else
        {
            int low = 1;  //min no. of candies a child can get since we have already taken care of 1 in base candy
            int high = Integer.MIN_VALUE;
            for(int candy: candies)
                high = Math.max(candy, high);
            
            int ans = -1;
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                
                if(util(candies, mid, k))
                {
                    ans = mid;
                    low = mid+1;
                }
                else
                    high = mid-1;
            }
            
            return ans;
        }
    }
    
    public boolean util(int[] candies, int candy, long k)
    {
        long child_count =0;
        for(int i=0; i<candies.length; i++)
        {
            child_count += candies[i]/candy;
        }
        
        return child_count>=k;
    }
}