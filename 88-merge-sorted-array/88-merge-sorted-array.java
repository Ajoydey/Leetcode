class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0, r=0, k=0;
        while(l<m+n && r<n)
        {
           if(nums1[l]>=nums2[r])
           {
               shift(nums1, l, m+n);
               nums1[l] = nums2[r];
               l++;
               r++;
           }
            else
                l++;
        }
        
        k = m+r;
        for(int i=k; i<m+n; i++)
        {
            nums1[i] = nums2[r++];
        }
    }
    public void shift(int[] nums1, int l, int k)
    {
        for(int i=k-1; i>=l+1; i--)
            nums1[i] = nums1[i-1];
    }
}