class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        
        double temp = Math.log(n)/Math.log(4);
        if(temp == Math.floor(temp))
            return true;
        else
            return false;
    }
}