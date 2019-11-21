// 5. Longest Palindromic Substring


class Solution {
    int isPalindrome(String st) {
        int j = st.length()-1;
        for(int i = 0; i<(st.length()/2); i++)
        {
            if(st.charAt(i)!=st.charAt(j))
            {
                return 0;
            }
            j--;
        }
        return st.length();
    }
    public String longestPalindrome(String s) {
        if(s.length() == 1 || s.length()==0)
        {
            return s;
        }
        int max=0;
        String ref = new String();
        
        for(int i=0; i<s.length()-1; i++)
        {
            for(int j=i+max; j<s.length(); j++)
            {
                if(max<j-i+1 && s.charAt(i) == s.charAt(j))
                {
                    int refNum = isPalindrome(s.substring(i, j+1));
                    if(refNum>max)
                    {
                        max = refNum;
                        ref = s.substring(i, j+1);
                    }
                }
            }
        }
        if(max == 0)
        {
            return s.substring(0,1);
        }
        return ref;
    }
}