// 7. Reverse Integer

class Solution {
    public int reverse(int x) {
        int rev=0,num=x,curr;
        while(num!=0)
        {
            curr=num%10;
            num/=10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE )) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE )) return 0;
            rev=rev*10+curr;
        }
        return rev;
    }
}