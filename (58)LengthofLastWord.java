// 58. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        int j=s.length()-1;
        while(j>=0 && s.charAt(j) == ' ')
        {
            j--;
        }
        while(j>=0 && s.charAt(j) != ' ')
        {
            c++;
            j--;
        }
        return c;
    }
}
