class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxlen = 0, minlen = Integer.MAX_VALUE;
        for(String s: strs)
            minlen = Math.min(minlen,s.length());
        
        if(minlen == 0)
            return "";
        
        String pre ="";
        for(int idx=0; idx<minlen; idx++)
        {
            char ch = strs[0].charAt(idx);
            boolean flag = true;
            for(int j=1; j<strs.length; j++)
            {
                if(strs[j].charAt(idx)!=ch){
                    flag=false;
                    break;
                }
            }
            if(flag)
                pre = pre+ch;
            else
                break;
        }
        return pre;
    }
}