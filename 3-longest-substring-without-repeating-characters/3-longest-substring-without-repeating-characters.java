class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*HashSet<Character> hs = new HashSet<>();
        
        int max = 0;
        int low = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                while(s.charAt(low) != s.charAt(i))
                {
                    hs.remove(s.charAt(low));
                    low++;
                }
                hs.add(s.charAt(i));
                
            }
            else
            {
                hs.add(s.charAt(i));
                max = Math.max(max, hs.size());
            }
            
        }*/
        int max =0;
        LinkedList<Character> arr = new LinkedList<>();
        for(int i=0; i<s.length(); i++)
        {
            while(arr.contains(s.charAt(i)))
                arr.remove(0);
            arr.add(s.charAt(i));
            max = Math.max(max, arr.size());
        }
        return max;
    }
}