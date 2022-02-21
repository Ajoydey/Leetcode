class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> flag = new HashSet<>();
        int i = 0;
        while(i<nums.length)
        {
            if(flag.contains(nums[i]))
                return true;
            flag.add(nums[i]);
            i++;
        }
        return false;
    }
}