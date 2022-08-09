class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.val - a.val);
        for(int key: hm.keySet())
        {
            pq.offer(new Pair(key, hm.get(key)));
        }
        int[] ans = new int[k]; int idx=0;
        while(idx<k)
        {
            ans[idx++] = pq.poll().key;
        }
        return ans;
    }
    class Pair{
        int key, val;
        public Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}
