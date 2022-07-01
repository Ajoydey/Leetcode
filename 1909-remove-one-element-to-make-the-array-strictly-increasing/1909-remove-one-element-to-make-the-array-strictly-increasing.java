class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for(int i =0; i<nums.length; i++)
        {
            if(isSorted(nums, i))
                return true;
        }
        return false;
    }
    public boolean isSorted(int[] nums, int ignore){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(i == ignore)
                continue;
            if(nums[i]>max)
                max = nums[i];
            else
                return false;
        }
        return true;
    }
}