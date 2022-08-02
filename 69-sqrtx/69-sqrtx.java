class Solution {
    public int mySqrt(int x) {
        
        if(x==1)
            return 1;
        long start = 0, end=x/2, ans=0;
        while(start<=end)
        {
            long mid = start + (end-start)/2;
            
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid < x)
            {
                ans = mid;
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return (int)ans;
    }
}