class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int j = 0, cur = 0, curFar = 0,n=nums.length;
		for (int i = 0; i <=curFar; i++) {
			curFar = Math.max(curFar, i + nums[i]);
			if (i == cur) {
				j++;
				cur = curFar;

				if (cur >= n - 1) {
					break;
				}
			}
		}
		return j;
    }
}