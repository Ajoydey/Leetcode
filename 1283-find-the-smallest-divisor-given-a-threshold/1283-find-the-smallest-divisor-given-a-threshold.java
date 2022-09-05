class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int num: nums)
        {
            high = Math.max(high,num);
        }
        if(threshold == nums.length)
            return high;
        
        while(low<high)
        {
            int mid = low + (high-low)/2;
            
            if(isPossible(nums, mid, threshold))
            {
                high = mid;
            }
            else
                low = mid+1;
        }
        return low;
    }
    public boolean isPossible(int[] nums, int divisor, int target)
    {
        double ans = 0.0;
        for(int num: nums)
        {
            ans += Math.ceil(num/(double)divisor);
        }
        return ans<=target;
    }
}