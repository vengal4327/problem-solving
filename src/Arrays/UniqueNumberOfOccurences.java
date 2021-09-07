class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        if(arr==null || arr.length==0)
        {
            return true;
        }
        
      Map<Integer, Integer> countByNumber = new HashMap<>();
        
        for(int num: arr)
        {
          countByNumber.put(num, countByNumber.getOrDefault(num, 0)+1);  
        }
        
        
        // [1-3, 2-5, 3-3]
        return countByNumber.size() == new HashSet(countByNumber.values()).size();
    }
}
