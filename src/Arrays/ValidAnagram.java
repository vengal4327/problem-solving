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
     
    int[] counter = new int[26];
        
    for(int i=0; i<s.length(); i++)
    {
      counter[s.charAt(i)-'a']++;
      counter[t.charAt(i)-'a']--;  
    }
    
    for(int num:counter)
    {
        if(num!=0) return false;
    }
        
    return true;
  }
}
