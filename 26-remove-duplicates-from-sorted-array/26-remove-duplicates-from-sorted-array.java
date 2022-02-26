class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1, k=nums.length;
        while(i<k)
        {
            if(nums[i] == nums[i-1])  //check for duplicate and update the length
            {
                deletion(nums, i);
                k--;
            }
            
            else
                i++;
        }
        return k;
    }
    public void deletion(int nums[], int p)  //function to deletion
    {
        int prev = nums[nums.length-1];
        for(int i=nums.length-2; i>=p; i--)
        {
            int curr  = nums[i];  //stores current element
            nums[i] = prev;
            prev = curr;
            
        }
    }
}