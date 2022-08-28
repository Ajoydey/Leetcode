class Solution {
    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        int i = temp.lastIndexOf(' ');
        return temp.length()-i-1;
    }
}