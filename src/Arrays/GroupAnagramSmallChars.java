class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
      // Strings contains only small alphabets...
      // Step-1 Each string --> create counter array
      // Step-2 From counter array --> Build String like--> "0#1#12#13..."
      // Map<String, List<String>>
      // Step-3: Check if string from step-2 is in map or else add
      // Return new ArrayList<>(map.values());
      
      Map<String, List<String>> anagramsBySortedString = new HashMap<>();
      for(String str: strs)
      {
        int[] counter = new int[26];
        for(int i=0; i<str.length(); i++)
        {
          counter[str.charAt(i) - 'a']++;  
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26;i++)
        {
            sb.append('#');
            sb.append(counter[i]);
        }
        String sortedString = sb.toString();  
        if(!anagramsBySortedString.containsKey(sortedString))
        {
          anagramsBySortedString.put(sortedString, new ArrayList<>());  
        }
        anagramsBySortedString.get(sortedString).add(str);  
      }
        
    return new ArrayList<>(anagramsBySortedString.values()); 
    }
}
