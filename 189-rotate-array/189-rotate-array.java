class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || k == nums.length)
            return;
        if(nums.length == 1)
            return;
        if(k>nums.length)
            k = k%nums.length;
        reverse(nums, 0, nums.length-1-k);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    void swap(int nums[], int x, int y)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    void reverse(int nums[], int lower, int upper)
    {
        while(lower<upper)
        {
            swap(nums, lower, upper);
            lower+=1;
            upper-=1;
        }
    }
}