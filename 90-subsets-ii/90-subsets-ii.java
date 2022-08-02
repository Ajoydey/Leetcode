class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, ans, new ArrayList<>(), 0);
        
        return ans;
    }
    public void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> tempList, int idx){
        
        ans.add(new ArrayList<>(tempList));
        
        for(int i=idx; i<nums.length; i++)
        {
            if(i>idx && nums[i]==nums[i-1])
                continue;
            tempList.add(nums[i]);
            backtrack(nums, ans, tempList, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}