class Solution {
    public int minSubArrayLen(int target, int[] nums) {
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
}