class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int count = 0;
        int i=0;
        String newnum = "";
        while(i<s.length())
        {
            char ch = s.charAt(i);
            if(ch == '6'){
                ch = '9';
                newnum = newnum+ch;
                break;
            }
            newnum = newnum+ch;
            i++;
        }
        if(i<s.length())
            return Integer.parseInt(newnum+s.substring(i+1));
        else
            return num;
    }
}