class Solution {
    public int findDuplicate(int[] nums) {
        //Floyd's cycle detection
        
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(nums[slow] != nums[fast]);
        
        fast = 0;
        while(nums[slow] != nums[fast])
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return nums[slow];
    }
}