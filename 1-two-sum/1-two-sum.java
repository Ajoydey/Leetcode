class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[] = new int[2];
        HashSet<Integer> temp= new HashSet<Integer>();
        temp.add(nums[0]);
        int i=1;
        while(!temp.contains(target-nums[i]))
        {
            temp.add(nums[i]);
            i++;
        }
        sol[1] = i;
        for(i=0; i<nums.length-1; i++)
        {
            if((nums[i]+nums[sol[1]]) == target)
            {
                sol[0] = i;
                break;
            }
        }
        return sol;
    }
}