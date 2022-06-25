class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sol = new ArrayList<>();
        for(int i=left; i<=right; i++)
        {
            if(selfDividing(i))
                sol.add(i);
        }
        return sol;
    }
    
    public boolean selfDividing(int n)
    {
        int temp = n;
        while(temp>0)
        {
            if(temp%10 == 0)
                return false;
            if(n%(temp%10) != 0)
                return false;
            temp/=10;
        }
        return true;
    }
}