class Solution {
    public int findUnsortedSubarray(int[] nums) {
        /*
        int[] nums_copy = nums.clone();
        Arrays.sort(nums_copy);
        int front=0,rear=nums.length-1;
        while(front!=nums.length && nums[front] == nums_copy[front])
            front++;
        if(front == nums.length)
            return 0;
        else
        {
            while(nums[rear] == nums_copy[rear])
                rear--;
            return rear-front+1;
        }
        */
        
        //O(n) approach
        int left = -1, right = -1;
        int max_so_far = Integer.MIN_VALUE;
        int min_so_far = Integer.MAX_VALUE;
        
        for(int i =0; i<nums.length; i++)
        {
            if(nums[i]>=max_so_far)
                max_so_far = nums[i];
            if(nums[i]<max_so_far)
                right = i;
        }
        for(int i = nums.length-1; i>=0; i--)
        {
            if(nums[i]<=min_so_far)
                min_so_far = nums[i];
            if(nums[i]>min_so_far)
                left = i;
        }
        if(left == -1)
            return 0;
        return right-left+1;
    }
}