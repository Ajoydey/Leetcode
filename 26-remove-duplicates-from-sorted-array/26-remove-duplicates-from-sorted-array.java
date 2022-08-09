class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int newsize = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(hs.contains(nums[i]))
                continue;
            else
            {
                hs.add(nums[i]);
                arr.add(nums[i]);
                newsize++;
            }
        }
        for(int i=0; i<newsize; i++)
            nums[i] = arr.get(i);
        
        return newsize;
    }
}