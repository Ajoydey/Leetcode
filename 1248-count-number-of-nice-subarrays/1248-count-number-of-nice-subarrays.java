class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0; i<nums.length; i++)
        {
            int rem = nums[i]%2;
            if(rem==1)
                nums[i] = 1;
            else
                nums[i] = 0;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);  //sum 0
        int count=0,sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum-k))   //don't know lol
                count+=hm.get(sum-k);
            
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}