class Solution {
    public int minDistance(String word1, String word2) {
      
      //If any word is empty then edit distance is length of other word.
      //Step-1: Fill Matrix values for scenarios where one word is empty i.e., word1 empty or word2 empty
      //Step-2: Fill other values in matrix using below conditions:
      //        a) If s1.charAt(i)==s2.charAt(j) --> store value of s1.charAt(i-1), s2.charAt(j-1)
      //        b) If s1.charAt(i)!=s2.charAt(j) --> store min of left, right, cross values +1 (Adding '1' IMP)
      // Return result[word1.length()][word2.length()];  
      if(word1.length()==0)
      {
          return word2.length();
      }
        
      if(word2.length()==0)
      {
          return word1.length();
      }  
        
      // check discussion section later....
        
      char[] chars1 = word1.toCharArray();
      char[] chars2 = word2.toCharArray();  
      int[][] result = new int[chars1.length+1][chars2.length+1];
      
      for(int i=0; i<result.length;i++)
      {
         result[i][0] = i;
      }
      for(int i=0; i<result[0].length;i++)
      {
         result[0][i] = i;
      }  
        
      for(int i=1; i<result.length;i++)
      {
       for(int j=1; j<result[0].length;j++)
       {
        if(chars1[i-1]==chars2[j-1])
        {
          result[i][j] = result[i-1][j-1];  
        }
         else
         {
            result[i][j] = Math.min(result[i][j-1], Math.min(result[i-1][j-1], result[i-1][j]))+1;
         }
       }
      }
        
        return result[chars1.length][chars2.length];
    }
}
