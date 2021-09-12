class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      
     Map<String, Integer> counter =  new HashMap<>();
        
     for(String str: words)
     {
         counter.put(str, counter.getOrDefault(str, 0)+1);
     }
        
     PriorityQueue<String> heap = new PriorityQueue<>((str1, str2) -> counter.get(str1)==counter.get(str2)? str2.compareTo(str1): Integer.compare(counter.get(str1), counter.get(str2)));

    for(String str: counter.keySet())
    {
        heap.offer(str);
        if(heap.size()>k)
        {
            heap.poll();
        }
    }
        
     List<String> result= new ArrayList();
        
     while(!heap.isEmpty())
     {
      result.add(0, heap.poll());   
     }
     return result;   
    }
}
