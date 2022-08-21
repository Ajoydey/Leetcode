class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()) //form a hasmap of characters of string s
        {
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(char ch : t.toCharArray()) //update the hashmap values with reference to characters of string t
        {
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch)-1);
        }
        int count = 0;
        for(char ch: hm.keySet()) //go through hasmap if value is greater than 0 we need replace that character with some other character
        {
            if(hm.get(ch)>0)
                count+=hm.get(ch);
            
        }
        return count;
    }
}