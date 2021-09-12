class Solution {
    public int myAtoi(String s) {
       if(s==null ||s.isEmpty()) return 0; 
       int sign=1;
        
       //check if string is null or empty and return 0
       //Step-1: get actual start Index by neglecting empty spaces
       //Step-2: populate sign and (Increment start only if sign is available)
       //step-3: a) check if charAt(start) is b/w 0 and 9 (while condition)
       //        b) Check if out of bounds and return MAX_VALUE or MIN_VALUE
       //        c) If not out of bounds then result = result*10+ (s.charAt(i) - '0');
        
      
       int start = eliminateSpaces(s);
        
        if(start >=s.length())
        {
            return 0;
        }
        if(s.charAt(start) == '+'||s.charAt(start)=='-')
        {
           sign = s.charAt(start++)=='+'? 1:-1; 
        }
        
       return retrieveAtoi(s,start, sign); 
    }
    
    private int eliminateSpaces(String s)
    {
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }
        return i;
    }
    
    private int retrieveAtoi(String str, int start, int sign)
    {
     int result=0;
        
     while(start<str.length() && (str.charAt(start) >= '0' && str.charAt(start) <='9'))
     {
       if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && str.charAt(start)-'0'>7))
       {
         return sign==1? Integer.MAX_VALUE: Integer.MIN_VALUE;
       }
       result = result*10 + (str.charAt(start)-'0');    
       start++;
         
     }
     return result*sign;
    }
}
