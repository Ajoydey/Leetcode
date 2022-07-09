class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n==1 || k==1) {
            return nums;
        }
        int[] ans=new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        int idx=0;
        for(int i=0;i<n;i++) {
            while(!dq.isEmpty() && dq.peek()<=i-k) {
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1) {
                ans[idx++]=nums[dq.peek()];
            }
        }
        return ans;
    }
}