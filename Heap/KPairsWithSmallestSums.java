class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
     
   if(nums1.length ==0 || nums1.length==0 || k==0) return new ArrayList();
      PriorityQueue<List<Integer>> heap = new PriorityQueue<>((list1, list2) ->  Integer.compare(list1.get(0) + list1.get(1), list2.get(0)+list2.get(1)));
      
      // Input: [1,7,11] and [2,4,6]   
      //Step-1: Initialize Heap with all values from arr1 and 1st value in arr2
      // Ex: [[1,2,0], [7,2,0], [11,2,0]  
      // Step-2: Add [1,2] to result and offer next possible List i.e., [1,4] to heap
      for(int num: nums1)
      {
         heap.add(new ArrayList<>(Arrays.asList(num, nums2[0], 0)));
      }
      
      List<List<Integer>> result =  new ArrayList<>();
        
        //nums1 =[1,7,11], nums2 = [2,4,6]  ---> Queue<List1() , >
      while(k>0 && !heap.isEmpty())
      {
        List<Integer> entry = heap.poll();
        result.add(entry.subList(0,2));
        k--; 
        if(entry.get(2)==nums2.length-1) continue;
        heap.offer(new ArrayList<>(Arrays.asList(entry.get(0), nums2[entry.get(2)+1], entry.get(2)+1)));
      }
        
      return result;  
    }
}
