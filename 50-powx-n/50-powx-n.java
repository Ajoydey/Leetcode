class Solution {
    public double myPow(double x, int n) {
        if(x==0)
            return 0.0;
        if(n==0)
            return 1.0;
        
        if(n>0)
        {
            double temp = myPow(x, n/2);
            if(n%2 == 0)
                return temp*temp;
            else
                return temp*temp*x;
        }
        else
        {
            double temp = myPow(x, n/2);
            if(n%2 == 0)
                return temp*temp;
            else
                return temp*temp*(1.0/x);
        }
    }
}