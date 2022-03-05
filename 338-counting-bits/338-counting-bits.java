class Solution {
    public int[] countBits(int n) {
        int count=0;
        int sol[] = new int[n+1];
        for(int j=0; j<sol.length; j++)
        {
            sol[j] = Integer.bitCount(j);
        }
        return sol;
    }
}