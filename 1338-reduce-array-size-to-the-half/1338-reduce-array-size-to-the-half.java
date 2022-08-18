class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        if(hm.size() == 1)
            return 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));  //store frequency of occurence max heap
        
        for(int key: hm.keySet()){
            pq.offer(key);
        }
        
        int count = n, size_req =0;
        while(count>n/2 && pq.size()!=0)
        {
            count-=hm.get(pq.poll());
            size_req++;
        }
        return size_req;
    }
}