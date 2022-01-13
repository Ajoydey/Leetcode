class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int flag[] = new int[256];
        for(int i =0; i<256; i++)
        flag[i] = 0;
        for(int i =0; i<s.length();i++)
        {
            flag[s.charAt(i)]+=1;
            flag[t.charAt(i)]-=1;
        }
        for(int i =0; i<256; i++)
        {if(flag[i] != 0) return false;}
        return true;
    }
}