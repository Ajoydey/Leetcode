class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max_count = 1, curr_count = 1;
        for(int i=1; i<nums.length; i++){
            
            if(nums[i]>nums[i-1]){
                curr_count++;
                max_count = Math.max(max_count, curr_count);
            }
            else{
                max_count = Math.max(max_count, curr_count);
                curr_count = 1;
            }
        }
        return max_count;
    }
}