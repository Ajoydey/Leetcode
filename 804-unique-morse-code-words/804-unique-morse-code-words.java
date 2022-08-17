class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> ans = new HashSet<>();
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String curr: words){
            String morse_code ="";
            for(char ch: curr.toCharArray()){
                morse_code = morse_code+morse[ch-'a'];
            }
            ans.add(morse_code);
        }
        return ans.size();
    }
}