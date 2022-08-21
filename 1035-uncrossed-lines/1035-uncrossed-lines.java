class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        //Find LCS that's the maximum number of lines we can draw
        
        int[][] lcs = new int[nums1.length+1][nums2.length+1];
        
        for(int i=0; i<=nums1.length; i++)
        {
            for(int j=0; j<=nums2.length; j++)
            {
                if(i==0 || j==0)
                    lcs[i][j] = 0;
                else
                {
                    if(nums1[i-1]==nums2[j-1])
                        lcs[i][j] = 1+lcs[i-1][j-1];
                    else
                        lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        return lcs[nums1.length][nums2.length];
    }
}