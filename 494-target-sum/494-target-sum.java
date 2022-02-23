class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return targetSum(nums, nums.length, target);
        
    }
    
    //recursive backtracking solution
    
    public int targetSum(int[] nums, int n, int target)
    {
        //base case if array size 0 no possible cases
        if(n==0)
            return 0;
        //productive base case
        if(n==1)
        {
            if(nums[n-1] == target && nums[n-1] == -target)  //to handle cases like [0,0,0,1] target 1
                return 2;
            else if(nums[n-1] == Math.abs(target))
                return 1;
            else
                return 0;
        }
        return targetSum(nums, n-1, target-nums[n-1])+targetSum(nums, n-1, target+nums[n-1]);
    }
}