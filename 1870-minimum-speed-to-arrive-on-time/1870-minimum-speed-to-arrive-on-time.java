class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        
        if(Math.ceil(hour) < dist.length)
            return -1;
        
        int min_speed = 1;
        int max_speed = Integer.MAX_VALUE-1;  //max_speed has to be the highest value of dist array * otherwise question breaks
        
        for(int i: dist)
            max_speed = Math.max(i, max_speed);
        
        
        int ans = -1;
        while(min_speed <= max_speed)
        {
            int mid = min_speed + (max_speed-min_speed)/2;
            
            if(isPossible(dist, hour, mid))
            {
                ans = mid;
                max_speed = mid-1;
            }
            else
                min_speed = mid+1;
        }
        return ans;
    }
    
    public boolean isPossible(int[] dist, double hour, int mid)
    {
        double count = 0.00;
        
        for(int i=0; i<dist.length; i++)
        {
            if(i == dist.length-1)
                count+= dist[i]/(double)mid;
            else
                count+= Math.ceil(dist[i]/(double)mid);
        }
        return count<=hour;
    }
}