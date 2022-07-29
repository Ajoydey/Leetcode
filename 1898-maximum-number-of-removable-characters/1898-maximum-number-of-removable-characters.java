class Solution {
    
    public int maximumRemovals(String s, String p, int[] removable) {
        
        int low = 1;  //min value of k
        int high = removable.length;  //max value of k
        
        int ans =0;
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            
            if(isPossible(s, p, removable, mid))
            {
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }
    
    public boolean isPossible(String s, String p, int[] removable, int k) //boolean function to check if p is a subsequence of s or not when k characters are eliminated  k is 1 based indexing
    {
        int p_idx = 0;
        int k_idx = k-1;
        
        HashSet<Integer> hs = removed(removable, k);
        for(int i=0; i<s.length() && p_idx<p.length(); i++)
        {
            
            
            if(!hs.contains(i) && s.charAt(i) == p.charAt(p_idx))
                p_idx++;
            
        }
        if(p_idx == p.length())
            return true;
        else
            return false;
    }
    public HashSet<Integer> removed(int[] removable, int k)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<k; i++)
            hs.add(removable[i]);
        
        return hs;
    }
}