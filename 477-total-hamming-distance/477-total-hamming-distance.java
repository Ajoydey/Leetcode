//Solution by bit-masking


class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum =0;
        for(int i=0; i<32; i++)
        {
            int mask = 1<<i;
            int countsetbit=0;
            for(int j=0; j<nums.length; j++)
            {
                if((nums[j] & mask) != 0)    //checking if ith bit of each element is 1
                    countsetbit+=1;
            }
            sum = sum + countsetbit*(nums.length-countsetbit);  //the second part gives the count of 0 bits
        }
        return sum;
    }
}
    