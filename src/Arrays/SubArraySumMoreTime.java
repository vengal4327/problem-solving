class Solution {
    public int subarraySum(int[] nums, int k) {
       
      int count=0;
        
      //[3,4,7,2,-3,1,2,4]  
      
      //Approach-1: Time-complexity- O(n2)  
      // For each pair get cummulative sum and see if it's equal to k
      // Example: [3] , [3,4], [3,4,7]... later [4], [4,7], [4,7,2]
      // Step-1: (int i=0; i<nums.length; i++)
      // Step-2:  In each Iteration of --> for(int j=i; j<nums.length;j++) calc sum and compare with 'K'
      for(int i=0;i<nums.length;i++)
      {
          int sum=0;
          for(int j=i; j<nums.length;j++)
          {
              sum=sum+nums[j];
              
              if(sum==k)
              {
                  count++;
              }
          }
      }
        
        return count;
    }
}
