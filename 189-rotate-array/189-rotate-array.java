class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k == 0)   //base condition
            return;
        if(nums.length == 1)   //if single element array return array itself
            return;
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