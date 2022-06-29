class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_sub_sum= Integer.MIN_VALUE;   //maximum subarray sum
        int min_sub_sum = Integer.MAX_VALUE;   // minimum subarray sum
        int curr_pos = 0;
        int curr_neg = 0;
        int total_sum = 0;
        for(int i =0; i<nums.length; i++)
        {
            curr_pos += nums[i];
            curr_neg += nums[i];
            total_sum += nums[i];
            if(curr_pos>max_sub_sum)
                max_sub_sum = curr_pos;
            if(curr_neg<min_sub_sum)
                min_sub_sum = curr_neg;
            if(curr_pos< 0)
                curr_pos = 0;
            if(curr_neg > 0)
                curr_neg = 0;
        }
        if(max_sub_sum > 0)
            return Math.max(max_sub_sum, total_sum-min_sub_sum);
        
        else   // for all negative cases
            return max_sub_sum;
    }
}