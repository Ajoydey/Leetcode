class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> sol = new HashSet<Integer>();
        while(!sol.contains(squareSum(n)))
        {
            int a=squareSum(n);
            if(a==1)
                return true;
            sol.add(a);
            n=a;
        }
        return false;
    }
    public int squareSum(int n)
    {
        int square_sum = 0;
        for(int i =n; i>0; i/=10)
        {
            int rem = i%10;
            square_sum+=rem*rem;
        }
        return square_sum;
    }
}