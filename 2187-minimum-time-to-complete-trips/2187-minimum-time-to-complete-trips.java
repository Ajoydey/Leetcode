class Solution {
    public boolean isPossible(int[] time, long mid, int totalTrips) {
        long count = 0;
        for(int data : time) {
            count += (mid/data);
            if(count >= totalTrips) {
                return true;
            }
        }
        return false;
    }
    
    public long minimumTime(int[] time, int totalTrips) {
        long high = Long.MAX_VALUE;
        long low = 0;
        long ans = -1;
        while(low < high) {
            long mid = low + (high - low)/2;
            if(isPossible(time, mid, totalTrips)) {
                ans = mid;
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}