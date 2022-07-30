class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> ans = new ArrayList<>();
        int[] maxFreq = new int[26];
        for(int j=0; j<words2.length; j++)
        {
            int[] freq = new int[26];
            for(char ch: words2[j].toCharArray())
            {
                freq[ch-'a']++;
                if(maxFreq[ch-'a']<freq[ch-'a'])
                    maxFreq[ch-'a'] = freq[ch-'a'];
            }
                
        }
        for(int i=0; i<words1.length; i++)
        {
            int[] charArray = new int[26];
            
            for(char ch: words1[i].toCharArray())
                charArray[ch-'a']++;
            
            boolean flag = true;
            
            for(int k=0; k<26; k++)
            {
                if(charArray[k]-maxFreq[k]<0)
                    flag = false;
            }
            
            if(flag)
                ans.add(words1[i]);
        }
        
        return ans;
    }
}