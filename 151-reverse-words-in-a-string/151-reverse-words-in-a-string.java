class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String rev = "";
        String word = "";
        s = s+" ";
        for(int i=0; i<s.length(); i++)
        {
            if(i!=0 && s.charAt(i) == ' ' && s.charAt(i-1) != ' ')
            {
                rev = word + " " + rev;
                word = "";
            }
            else if(s.charAt(i) == ' ' && s.charAt(i-1) == ' ')
                continue;
            else
                word = word + s.charAt(i);
        }
        return rev.trim();
    }
}