class RotateArray {
    public void rotate(int[] nums, int k) {
      
       // Brute force
       // New array and iterate to build array - O(n) time and O(n) space
       
     //[1,2,3,4,5,6,7], k=3
     // [4,3,2,1,7,6,5] --> reverse from 0 to nums.length-k-1 and reverse from nums.length-k to nums.length
     // [5,6,7,1,2,3,4] --> Reverse whole array   
      k = k%nums.length;
      reverse(nums, 0, nums.length-k-1);  
      reverse(nums, nums.length-k, nums.length-1);
      reverse(nums, 0, nums.length-1);
    }
    
    private void reverse(int[] nums, int start, int end)
    {
     while(start<=end)
     {
         int temp = nums[end];
         nums[end] = nums[start];
         nums[start] = temp;
         start++;
         end--;
     }
    }
}
