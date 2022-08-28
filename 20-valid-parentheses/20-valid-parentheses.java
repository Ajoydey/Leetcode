class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            if(st.isEmpty())
                st.add(temp);
            else
            {
                if(temp =='(' || temp =='{' || temp == '[')
                    st.add(temp);
                else
                {
                    if(temp==')')
                    {
                        if(st.peek() != '(')
                            return false;
                        else
                            st.pop();
                    }
                    if(temp==']')
                    {
                        if(st.peek() != '[')
                            return false;
                        else
                            st.pop();
                    }
                    if(temp=='}')
                    {
                        if(st.peek() != '{')
                            return false;
                        else
                            st.pop();
                    }
                }
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}