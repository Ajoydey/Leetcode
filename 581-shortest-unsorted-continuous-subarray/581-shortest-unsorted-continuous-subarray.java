class Solution {
    public int findUnsortedSubarray(int[] nums) {
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
    }
}