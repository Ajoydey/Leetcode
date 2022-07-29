class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //The min banana eating capacity must lie between the highest element of the array and 1, can efficiently use binary search
        
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int bananas: piles)
        {
            if(bananas>high)
                high = bananas;
        }
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(util(piles, h, mid))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    
    public boolean util(int[] piles, int h, int k)
    {
        int count = 0;
        for(int i=0; i<piles.length; i++)
        {
            count += Math.ceil(piles[i]/(double)k);
        }
        return count <= h;
    }
}