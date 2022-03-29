class Solution {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        
        //modified binary search
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid] == target)
                return mid;
            //look for sorted part of the array
            if(nums[mid]>=nums[low])
            {
                //check which interval to search
                if(target>=nums[low] && target <=nums[mid])
                    high = mid-1;
                
                else
                    low = mid+1;
            }
            else
            {
                if(target<=nums[high] && target>=nums[mid])
                    low = low+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}