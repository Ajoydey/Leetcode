class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        
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
                low++;  //the last increement is for the same element no adding in set
            
            }
            else{
            hs.add(s.charAt(i));
            max = Math.max(max, i-low+1);}
            
            
        }
        /*int max =0;
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            while(arr.contains(s.charAt(i)))
                arr.remove(0);
            arr.add(s.charAt(i));
            max = Math.max(max, arr.size());
        }*/
        return max;
    }
}