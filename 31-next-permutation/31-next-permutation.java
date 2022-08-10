class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx_to_be_changed = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                idx_to_be_changed = i;
                break;
            }
        }
        if(idx_to_be_changed == -1){
            Arrays.sort(nums);
            return;
        }
        int next_greater = findNextGreater(nums, n, idx_to_be_changed);
        //swap idx_to_be_changed and next_greater
        swap(nums, idx_to_be_changed, next_greater);
        reverse(nums, idx_to_be_changed+1, n-1);
    }
    public int findNextGreater(int[] nums, int n, int idx){
        int flag = -1;
        for(int i=n-1; i>idx; i--){
            if(nums[i]>nums[idx]){
                if(flag == -1)
                    flag = i;
                else{
                    if(nums[i]<nums[flag])
                        flag = i;
                }
            }
        }
        return flag;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int low, int high){
        while(low<=high){
            swap(nums, low, high);
            low++;
            high--;
        }
    }
}