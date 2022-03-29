class Solution {
    public boolean canJump(int[] nums) {
        
        //Greedy approach
        
        int far=0;   //farthest index that can be reached from curr index
        int n = nums.length;
        if(n==1)
            return true;
        for(int i=0; i<=far; i++)
        {
            far = Math.max(far, i+nums[i]);
            if(far>=n-1)    
                return true;
        }
        return false;
    }
}