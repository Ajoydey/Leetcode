class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>(), 0);
        
        return ans;
    }
    public void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> tempList, int idx){
        
        ans.add(new ArrayList<>(tempList));
        
        for(int i=idx; i<nums.length; i++)
        {
            tempList.add(nums[i]);
            backtrack(nums, ans, tempList, i+1);
            tempList.remove(tempList.size()-1);
        }
        
    }
}