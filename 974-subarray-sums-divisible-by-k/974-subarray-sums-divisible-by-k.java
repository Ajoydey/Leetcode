class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);  //rem 0
        int count=0,sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            int rem = sum%k;
            if(rem<0)
                rem+=k;
            if(hm.containsKey(rem))   //don't know lol
                count+=hm.get(rem);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }
}