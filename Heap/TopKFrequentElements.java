class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> countByNum = new HashMap<>();
      
      for(int num:nums)
      {
       countByNum.put(num, countByNum.getOrDefault(num,0)+1);  
      }
         
     PriorityQueue<Integer> minHeap = new PriorityQueue<>((num1,num2)-> Integer.compare(countByNum.get(num1), countByNum.get(num2)));
        
     for(Integer key: countByNum.keySet())
     {
       minHeap.offer(key);
       if(minHeap.size()>k)
       {
           minHeap.poll();
       }
     }
     
    int[] result = new int[minHeap.size()];
    for(int i=0;i<result.length;i++)
    {
        result[i] = minHeap.poll();
    }
        
    return result;
    }
}
