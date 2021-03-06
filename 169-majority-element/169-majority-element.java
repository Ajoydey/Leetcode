class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele = Integer.MAX_VALUE;
        for(int i =0; i<nums.length; i++)
        {
            if(count==0)
            {
                ele = nums[i];
                count++;
            }
            else
            {
                if(ele == nums[i])
                    count++;
                else
                    count--;
            }
        }
        return ele;
    }
}