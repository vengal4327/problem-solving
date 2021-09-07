class Solution {
    public int subarraySum(int[] nums, int k) {
       
      int count=0;
        
      //[3,4,7,2,-3,1,2,4]  
      
      //Approach-2: Time and space complexity - O(n)
      // iterate thru array only once
      // On each Iteration, check if   
        
      Map<Integer, Integer> countByCummSum = new HashMap<>();
      countByCummSum.put(0,1);  
        
      int sum=0;  
      for(int num: nums)
      {
        sum = sum + num;
          
        if(countByCummSum.containsKey(sum-k))
        {
         // countByCummSum.get(sum-k) -- Is to account for the sub arrays whose sum=0    
         count = count + countByCummSum.get(sum-k);   
        }
        
        countByCummSum.put(sum, countByCummSum.getOrDefault(sum,0)+1);
      }
        
        return count;
    }
}
