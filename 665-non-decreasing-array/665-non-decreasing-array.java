class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for(int i =0 ; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
            {
                count++;
                if(prev<=nums[i+1])
                    nums[i] = nums[i+1];
                else
                    nums[i+1] = nums[i];
            }
            else
                prev = nums[i];
            if(count>1)
                return false;
        }
        return true;
    }
}