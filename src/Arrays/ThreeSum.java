class Solution {
    public List<List<Integer>> threeSum(int[] myArr) { 
        //I/p: [-1,0,1,2,-1,-4]
       //After sort: [-4,-1, -1, 0, 1, 2]
        //Example-1: [0,0,0] 
       // For each element in array, do two-pointer approach of finding other complement elements..
       // Step-1: Sort array in order to perform two-pointer approach
       // For each element, get complementary sum 
       //        If sum matches with two pointers --> add triplet to result and Inc start, decrement end
       //        else If two_pointers_sum < sum --> start++
       //        else end-- 
       Arrays.sort(myArr); 
       List<List<Integer>> result = new ArrayList();
       
        for(int i=0;i<myArr.length-2;i++)
        {
            if(i==0 || (myArr[i]<=0 && myArr[i]!=myArr[i-1]))
            {
             int start=i+1;
             int end = myArr.length-1;
             int sum = 0-myArr[i];
             while(start<end)
             {
             if(myArr[start]+myArr[end]==sum)
             {
                 //add list
                  result.add(new ArrayList(Arrays.asList(myArr[i], myArr[start], myArr[end])));
                 //inc start
                 while(start<end && myArr[start]==myArr[start+1]) start++;
                 //dec end
                 while(start<end && myArr[end]==myArr[end-1]) end--;
                 start++;
                 end--;
             }
            else if(myArr[start]+myArr[end]<sum)
            {
              while(start<end && myArr[start]==myArr[start+1]) start++;
              start++;
            }
            else
            {
               while(start<end && myArr[end]==myArr[end-1]) end--; 
               end--; 
            }
            }
          }
        }
        
        return result;
    }
}
