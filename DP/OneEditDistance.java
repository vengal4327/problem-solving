class Solution {
    public boolean isOneEditDistance(String word1, String word2) {
     
    //Step-1: Iterate for only common length of word-1 and word-2
    //Step-2: if char at a position are not matching 
    //         a) their length are same then next substrings should be equal
    //         b) If word1.length<word2.length --> word1(i) and word2(i+1) should be equal
    //         c) If word1.length>word2.length --> word1(i+1) and word2(i) should be equal
    //Step-3: Otherwise there should be only one char diff b/w word1 and word2 in order to be true
             // Example: "Sach", "Sachi"
        
     for(int i=0; i<Math.min(word1.length(), word2.length()); i++)
     {
       if(word1.charAt(i)!=word2.charAt(i))
       {
          if(word1.length() == word2.length())
          {
            return word1.substring(i+1).equals(word2.substring(i+1));  
          }
          else if(word1.length() < word2.length())
          {
              return word1.substring(i).equals(word2.substring(i+1)); 
          }
          else
          {
             return word1.substring(i+1).equals(word2.substring(i));  
          }
       }   
     }
     
    return Math.abs(word1.length() - word2.length()) ==1;
    }
}
