class Solution {
    public int minMoves2(int[] nums) {
        
        //sort first
        
        Arrays.sort(nums);
        //to make each element equal its better to choose the middle element
        
        int mid = (nums.length-1)/2;
        
        int moves = 0;
        for(int i =0; i<nums.length; i++)
            moves+= Math.abs(nums[i] - nums[mid]);
        
        return moves;
    }
}