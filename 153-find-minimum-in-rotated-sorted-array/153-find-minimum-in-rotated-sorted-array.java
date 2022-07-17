class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        if(high==0)
            return nums[0];
        if(nums[0] < nums[high]) //no rotation
            return nums[0];
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if((mid == nums.length-1 && nums[mid]<nums[mid-1]) || (nums[mid]< nums[mid+1] && nums[mid]<nums[mid-1]))
                return nums[mid];
            
            if(nums[mid] > nums[high])  //if this condition is true we definitrly have the smallest element in right half
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}