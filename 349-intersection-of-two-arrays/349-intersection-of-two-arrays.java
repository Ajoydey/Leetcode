class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer> ar = new ArrayList<>(); 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=nums1.length-1, r= nums2.length-1;
        
        while(l>=0 && r>=0)
        {
            if((nums1[l] == nums2[r])&& !(ar.contains(nums1[l])))
            {
                ar.add(nums1[l]);
                l--;
                r--;
            }
            else if(nums1[l]<nums2[r])
                r--;
            else
                l--;
        }
        int[] sol = new int[ar.size()];
        for(int i=0; i<ar.size(); i++)
            sol[i]= ar.get(i);
        return sol;
    }
}