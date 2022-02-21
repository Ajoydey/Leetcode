class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's algorithm
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            curr_sum+=nums[i];
            if(max_sum<curr_sum)
                max_sum = curr_sum;
            if(curr_sum<0)
                curr_sum = 0;
        }
        return max_sum;
        
    }
}