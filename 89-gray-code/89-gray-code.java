class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        sol.add(0);
        int i = 0;
        while(i<n)
        {
            int mask = 1<<i;
            
            int len = sol.size();
            
            for(int val =len-1; val>=0; val--)
                sol.add(sol.get(val)+mask);
            
            i++;
        }
        return sol;
    }
}