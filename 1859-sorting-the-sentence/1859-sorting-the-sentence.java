class Solution {
    public String sortSentence(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
                count++;
        }
        String[] temp = new String[count];
        String word = "";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
                continue;
            if(ch>='1' && ch<='9')
            {
                temp[ch-'1'] = word;
                word = "";
            }
            else
            {
                word = word+ch;
            }
        }
        String str = "";
        for(String i: temp)
        {
            str = str+i+" ";
        }
        return str.trim();
    }
}