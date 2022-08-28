class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //O(n) approach
        int low =0, high = 0, sum=0, minSize = Integer.MAX_VALUE;
        while(high<nums.length)
        {
            sum+=nums[high++];
            while(sum>=target)
            {
                if(sum-nums[low]<target)
                {
                    minSize = Math.min(minSize,high-low);
                }
                sum-=nums[low++];
            }
        }
        if(minSize == Integer.MAX_VALUE)
            return 0;
        return (sum>=target) ? Math.min(minSize,high-low):minSize;
    }
    
    /*O(nlogn) approach
    public int binSearch(int target, int[] nums)
    {
        int low = 1, high = nums.length;  
        int ans = 0;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isPossible(mid, nums, target))
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;
    }
    public boolean isPossible(int k ,int[] nums, int target)
    {
        int sum=0;
        for(int i=0; i<k; i++)
        {
            sum+=nums[i];
            if(sum>=target)
                return true;
        }
        for(int i=k; i<nums.length; i++)
        {
            sum = sum+nums[i]-nums[i-k];
            if(sum>=target)
                return true;
        }
        return false;
    }
    */
}