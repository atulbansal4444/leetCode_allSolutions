//8. String to Integer (atoi)

class Solution {
    public int myAtoi(String str)
    {
      String str1 = "";
      boolean vBol = false;
      if(str.length()==0)
      {
        return 0;
      }
      int i=0;
      while(str.charAt(i)==' ')
      {
          i++;
            if(i==str.length())
            {
              return 0;
            }
      }
      int x = str.charAt(i);
      if(x>=48 && x<=57 || x==45 || x==43)
      {
        if(x==43 && i!=str.length()-1) {
        i++;
        x = str.charAt(i);
      }
      else if(x==45 && i!=str.length()-1)
      {
          vBol = true;
          i++;
          x = str.charAt(i);
      }
        while(x>=48 && x<=57)
        {
          str1 = str1 + str.charAt(i);
          i++;
          if(i==str.length()) break;
          x = str.charAt(i);
        }
      }
      if(str1=="") {
        return 0;
      }
      else 
      {
        try {
          int ref = Integer.parseInt(str1);
          ref = vBol ? ref*-1 : ref;
          return ref;
        }
        catch(Exception e) {
          if(vBol) {
            return Integer.MIN_VALUE;
            }
          else {
            return Integer.MAX_VALUE;
            }
        }
      }
    }
}