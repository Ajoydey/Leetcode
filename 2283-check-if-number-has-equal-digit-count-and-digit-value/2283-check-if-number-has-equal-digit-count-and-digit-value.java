class Solution {
    public boolean digitCount(String num) {
        int digitcount[] = new int[10];
        for(int i=0; i<num.length(); i++)
        {
            digitcount[num.charAt(i)-'0']++;
        }
        for(int i=0; i<num.length(); i++)
            if(num.charAt(i)-'0' != digitcount[i])
                return false;
        return true;
    }
}