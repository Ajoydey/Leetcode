class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int index[] = new int[2];
        int idx = binSearch(nums, target, true);
        
        if(idx == -1)
        {
            index[0] = -1;
            index[1] = -1;
        }
        else
        {
            index[0] = idx;
            index[1] = binSearch(nums, target, false);
        }
        return index;
        
    }
    public int binSearch(int[] nums, int target, boolean flag)
    {
        int low = 0;
        int high = nums.length-1;
        
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]>target)
                high = mid-1;
            else if(nums[mid]<target)
                low = mid+1;
            else
            {ans = mid;
                if(flag) // finding first index
                    high = mid-1;
                
                else  //finding last index
                    low = mid+1;}
        }
        return ans;
    }
}