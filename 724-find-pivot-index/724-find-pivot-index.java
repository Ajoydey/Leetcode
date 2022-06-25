class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int i=0; i<nums.length; i++)
            totalsum+=nums[i];
        int curr_sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            int right_sum = totalsum-curr_sum-nums[i];
            if(curr_sum == right_sum)
                return i;
            curr_sum += nums[i];
        }
        return -1;
    }
}