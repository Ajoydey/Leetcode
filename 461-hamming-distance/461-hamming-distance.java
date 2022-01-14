class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y;  //1 if bits aren't equal
        int count=0;
        while(z>0)
        {
            int temp = z%2;
            if(temp==1)
                count++;
            z/=2;
        }
        return count;
    }
}