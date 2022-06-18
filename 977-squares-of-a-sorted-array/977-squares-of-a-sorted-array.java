class Solution {
    public int[] sortedSquares(int[] nums) {
        //double pointer
        int[] sorted = new int[nums.length];
        int low=0;
        int high = nums.length-1;
        int index = nums.length-1;
        while(low<=high)
        {
            if(nums[low]*nums[low] >= nums[high]*nums[high])
            {
                sorted[index--]  = nums[low]*nums[low];
                low++;
            }
            else
            {
                sorted[index--] = nums[high]*nums[high];
                high--;
            }

        }
        return sorted;
    }
}