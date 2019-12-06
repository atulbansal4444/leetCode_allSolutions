//28. Implement strStr()

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int n = needle.length();
        int h = haystack.length();
        if (n > h) return -1;
        
        int i = 0, j = h-1;
        int i1 = 0, j1= n-1;
        while (i<=j && i1<=j1)
        {
            i1 = 0;
            int x = i;
            while (i1<=j1 && x<=j && haystack.charAt(x) == needle.charAt(i1))
            {
                i1++; 
                x++;
            }
            if(i1>j1) return x-i1;
            i++;
        }
        return -1;
    }
}