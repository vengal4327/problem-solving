class Solution {
    public int threeSumClosest(int[] myArr, int target) {

        //I/p: [-1,0,1,2,-1,-4]
       //After sort: [-4,-1, -1, 0, 1, 2]
        //Example-1: [0,0,0] 
       // For each element in array, do two-pointer approach of finding other complement elements..
       // Step-1: Sort array in order to perform two-pointer approach
       // For each element, get complementary sum 
       //        If curr_sum lessthan sum --> update result
       //        else If two_pointers_sum < sum --> start++
       //        else end-- 
       Arrays.sort(myArr); 
       int result=3000;
       
        for(int i=0;i<myArr.length-2;i++)
        {
            if(i==0 || myArr[i]!=myArr[i-1])
            {
             int start=i+1;
             int end = myArr.length-1;
             while(start<end)
             {
             if(Math.abs(target-(myArr[i]+myArr[start]+myArr[end])) < Math.abs(target-result))
             {
                 //add list
                 result = myArr[i]+myArr[start]+myArr[end];
             }
             if(myArr[i]+myArr[start]+myArr[end] <target)
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
