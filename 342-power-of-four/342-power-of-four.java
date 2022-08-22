class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        
        if(Math.log(n)/Math.log(4) == Math.floor(Math.log(n)/Math.log(4)))
            return true;
        else
            return false;
    }
}