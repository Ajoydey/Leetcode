class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE, minSum = 0;
        
        for(int i=0; i<=nums.length-3; i++)
        {
            
            int low = i+1, high = nums.length-1;
            while(low<high)
            {
                int sum = nums[i] + nums[low] + nums[high];
                
                if(min > Math.abs(sum-target))
                {
                    minSum = sum;
                    min = Math.abs(sum-target);
                }
                if(sum<target)
                    low++;
                else
                    high--;
            }
        }
        return minSum;
    }
}