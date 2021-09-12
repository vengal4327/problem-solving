class Solution {
    public void reverseString(char[] s) {
      if(s==null || s.length==0) return;  
      int start=0;
      int end=s.length-1;
        
      while(start<end)
      {
       reverse(s, start, end);
       start++;
       end--;
      }
    }
    
    private void reverse(char[] s, int start, int end)
    {
     char temp = s[start];
     s[start] = s[end];
     s[end] = temp;   
    }
}
