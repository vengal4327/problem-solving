class Solution {
    public String longestPalindrome(String s) {
        //"racecar" and "aabbaa"
       // O(N*3) -- Brute force
       // Move Around center
       // Initialize start and end to 0 
       // Step-1: Iterate thru each character and Identify longest palindrome It can form
       // Step-2: Update start and end accordingly
       // Step-3: return substring using start and end Index 
    
      if(s==null || s.length()==0) return s;
        
      int start=0, end=0;
      for(int i=0; i<s.length();i++)
      {
         int len1 = maxPalindromeAround(s, i,i);
         int len2 = maxPalindromeAround(s, i,i+1); // check Index out of bounds condition 
         int len = Math.max(len1, len2);
         if(len>end-start)
         {
             start = i-((len-1)/2); 
             end = i+(len/2);
         }
      }
       return s.substring(start, end+1); 
    }
    
    private int maxPalindromeAround(String str, int start, int end)
    {
      if(end>=str.length()) return 0;
      
       while(start>=0 && end<str.length() && str.charAt(start) == str.charAt(end))
       {
        start--;
        end++;   
       }  
            
        return end-start-1;    
    }
}
