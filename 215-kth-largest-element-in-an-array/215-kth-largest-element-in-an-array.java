class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Priority queue
        //Quicksort partition diyeo hobe
        
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int i=0;
        while(i<=nums.length-1)
        {
            pq.add(nums[i]);
            i++;

        }
        int ans = 0; i=0;
        while(i<=nums.length-k)
        {
            ans = pq.poll();
            i++;
        }
        return ans;
    }
}