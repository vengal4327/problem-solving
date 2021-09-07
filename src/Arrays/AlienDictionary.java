class Solution {
    public boolean isAlienSorted(String[] words, String order) {
  
     Map<Character, Integer> orderMap =  new HashMap<>();
     // All alphabets are added to map for O(1) retrieval...   
     for(int i=0;i<order.length(); i++)
     {
        orderMap.put(order.charAt(i), i);   
     }
      
     for(int j=1;j<words.length;j++)
     {  
       char[] firstWord = words[j-1].toCharArray();
       char[] secondWord = words[j].toCharArray();
       if(Arrays.equals(firstWord, secondWord))
       {  
         continue;
       }   
       
       int minWordLength = Math.min(firstWord.length, secondWord.length)-1;
       for(int wordIndex=0; wordIndex<=minWordLength; wordIndex++)
       {
        if(orderMap.get(firstWord[wordIndex])<orderMap.get(secondWord[wordIndex]))
        {
          break; 
        }
        else if(orderMap.get(firstWord[wordIndex]) == orderMap.get(secondWord[wordIndex]) && wordIndex<secondWord.length-1)
        {
          continue;
        }
        else
        {
          return false;
        }
      }
    } 
        
    return true;   
  }
}
