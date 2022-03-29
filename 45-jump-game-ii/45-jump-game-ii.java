class Solution {
    public int jump(int[] nums) {
        int j = 0, cur = 0, curFar = 0,n=nums.length;
		for (int i = 0; i < n - 1; i++) {
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