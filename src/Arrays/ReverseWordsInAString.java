class Solution {
    public String reverseWords(String s) {
        
      if(s==null||s.isEmpty()) return s;
      
      char[] chars = s.toCharArray();
      
      //  trimSpaces, ReverseWholeString , ReverseWords
      //  "  Bob    Loves  Alice   "
      // "Bob Loves Alice"
      // "ecilA sevoL boB"
      // "Alice Loves Bob"
      int end = trimSpaces(chars); 
      reverseString(chars, 0, end);
      reverseWords(chars, end);
      return charsToString(chars, end);        
      }
    
    private int trimSpaces(char[] chars)
    {
      int index=0, incrementer=0;  
      while(incrementer <chars.length)
      {
        while(incrementer <chars.length && chars[incrementer]==' ')  incrementer++;
        while(incrementer <chars.length && chars[incrementer]!=' ') chars[index++] = chars[incrementer++];
        while(incrementer <chars.length && chars[incrementer]==' ')  incrementer++;
        if(incrementer < chars.length) chars[index++]=' ';
      }
          
     return index-1;
    }
    
    private void reverseString(char[] chars, int start, int end)
    {
     while(start<=end)
     {
      char temp = chars[start];
      chars[start++] = chars[end];
      chars[end--] = temp;
     }
    }
    
    private void reverseWords(char[] chars, int end)
    {
     int wordStart=0;
     int wordEnd=0;
     while(wordEnd<=end)
     {
         if(chars[wordEnd] == ' ') 
         {
          reverseString(chars, wordStart, wordEnd-1);
          wordStart = wordEnd+1;   
         }
         else if(wordEnd == end)
         {
          reverseString(chars, wordStart, wordEnd);   
         }
         
         wordEnd++;
     }
    }
    
    private String charsToString(char[] chars, int end)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=end; i++)
        {
          sb.append(chars[i]);  
        }
        
        return sb.toString();
    }
}
