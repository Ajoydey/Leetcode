class Solution {
    public int maxArea(int[] height) {
        // I need to maximize area between two blocks. Area = smaller block heaight * distance between blocks
        // Use 2 pointers to represent two blocks
        
        int l =0, r = height.length-1;
        int maxWater = 0;
        while(l<r)
        {
            //two cases
            if(height[l]<height[r]){
                //update area
                maxWater = Math.max(maxWater,height[l]*(r-l));
                l++;  //update l
            }
            else{
                maxWater = Math.max(maxWater, height[r]*(r-l));
                r--;  //update r
            }
        }
        return maxWater;
    }
}