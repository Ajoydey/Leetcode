class Solution {
    public boolean digitCount(String num) {
        int digitval[] = new int[10];
        int digitcount[] = new int[10];
        for(int i=0; i<num.length(); i++)
        {
            digitval[i] = num.charAt(i)-'0';
            digitcount[num.charAt(i)-'0']++;
        }
        for(int i=0; i<10; i++)
            if(digitval[i]!=digitcount[i])
                return false;
        return true;
    }
}