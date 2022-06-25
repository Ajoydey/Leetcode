class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        sol.add(prev);
        if(numRows ==1)
            return sol;
        for(int i =2; i<=numRows; i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j =1; j<=i; j++)
            {
                if(j==1 || j==i)
                    temp.add(1);
                else
                    temp.add(prev.get(j-1)+prev.get(j-2));
            }
            sol.add(temp);
            prev = temp;
        }
        return sol;
    }
}