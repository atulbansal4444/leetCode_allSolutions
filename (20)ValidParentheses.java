//20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        if(s.length()==1)
        {
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        st.push(' ');
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else if((st.peek()=='{' && s.charAt(i)=='}') || (st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='[' && s.charAt(i)==']'))
            {
                st.pop();
            }
            else
            {
                return false;
            }
        }
        if(st.size()!=1)
        {
            return false;
        }
        return true;
    }
}