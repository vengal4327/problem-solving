class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
      // Strings can contain characters of any type..
        
      // Step-1: Sort each string
      // Step-2: Initialize Map<String, List<String>> -- key is sorted string and map is anagrams related to sorted string
      // return new ArrayList<>(map.values());
      
    Map<String, List<String>> anagramsBySortedString = new HashMap<>();     

    for(String str: strs)
    {
     char[] chars = str.toCharArray();
     Arrays.sort(chars);
     String sortedString = String.valueOf(chars);
     
     if(!anagramsBySortedString.containsKey(sortedString))
     {
        anagramsBySortedString.put(sortedString, new ArrayList<>());
     }
      anagramsBySortedString.get(sortedString).add(str);  
    }
      return new ArrayList<>(anagramsBySortedString.values());  
    }
}
