class Solution {
    public int hIndex(int[] citations) {
        
        int low =0;
        int high = citations.length;
        
        int ans = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            
            if(solve(citations, mid))
            {
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }
    
    public boolean solve(int[] citations, int k)
    {
        int count =0;
        for(int i=0; i<citations.length; i++)
        {
            if(citations[i]>=k)
                count++;
        }
        return count>=k;
    }
}