class Solution {
    public void reverseWords(char[] s) {
      // reverseString()
       // reverseWords()
      
       reverseString(s, 0, s.length-1);
       reverseWordByWord(s); 
    }
    
    private void reverseString(char[] str, int start, int end){
     while(start<end)
     {
      char temp = str[start];
      str[start++] = str[end];
      str[end--] = temp;   
     }
    }
    
    private void reverseWordByWord(char[] str)
    {
     int wordStart=0;
     int wordEnd=0;
     while(wordEnd<str.length)
     {
      if(str[wordEnd] == ' ')
      {
        reverseString(str, wordStart, wordEnd-1);
        wordStart = wordEnd+1;  
      }
      else if(wordEnd == str.length-1)
      {
       reverseString(str, wordStart, wordEnd);    
      }
         
     wordEnd++;
     }
    }
}
