class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] ans = new double[nums.length-k+1];
        ArrayList<Integer> window = new ArrayList<>();
        int start = 0;
        
        for(int end=0; end<nums.length+1; end++)
        {
            if(window.size() == k)
            {
                Collections.sort(window);
                double median = 0.0;
                if(k%2 == 0)
                    median = (double)window.get(k/2)/2.0 + (double)window.get(k/2-1)/ 2.0;
                
                else
                    median = window.get(k/2);
                
                ans[start] = median;
                window.remove(Integer.valueOf(nums[start]));
                start++;
            }
            if(end<=nums.length-1)
            window.add(nums[end]);
        }
        return ans;
    }
}