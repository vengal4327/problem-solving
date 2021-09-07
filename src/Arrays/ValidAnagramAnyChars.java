class Solution {
    public boolean isAnagram(String s, String t) {
      if(s==null&&t==null)
      {
          return true;
      }
      if(s==null || t==null || s.length()!=t.length())
      {
          return false;
      }  
     
    // hashmap to put Character and It's count-- finally check if any of the values are not zero
     Map<Character, Integer> countByChar = new HashMap<>();
     for(int i=0;i<s.length(); i++)
     {
       countByChar.put(s.charAt(i), countByChar.getOrDefault(s.charAt(i), 0)+1);
       countByChar.put(t.charAt(i), countByChar.getOrDefault(t.charAt(i), 0)-1);
     }
        
     for(int num: countByChar.values())
     {
         if(num!=0) return false;
     }
        
        return true;
  }
}
