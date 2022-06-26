class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] left_max = new int[nums.length];
        left_max[0] = nums[0];
        for(int i =1; i<nums.length; i++)
        {
            left_max[i] = Math.max(left_max[i-1], nums[i]);
        }
        int[] right_min = new int[nums.length];
        right_min[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--)
        {
            right_min[i] = Math.min(right_min[i+1], nums[i]);
        }
        int beauty = 0;
        for(int i =1; i<=nums.length-2; i++)
        {
            if(nums[i]>left_max[i-1] && nums[i]<right_min[i+1])
                beauty+=2;
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1])
                beauty+=1;
        }
        return beauty;
    }
}