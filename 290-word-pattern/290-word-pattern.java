class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String arr[] = s.split(" ");
        if(pattern.length() != arr.length)
            return false;
        for(int i=0; i<pattern.length(); i++)
        {
            if(!hm.containsKey(pattern.charAt(i)))
            {
                if(hm.containsValue(arr[i]))
                    return false;
                hm.put(pattern.charAt(i), arr[i]);
            }
                else
                {
                    if(!hm.get(pattern.charAt(i)).equals(arr[i]))
                        return false;
                }
            }
            return true;
    }
}