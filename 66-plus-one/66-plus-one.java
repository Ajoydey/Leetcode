class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        if(digits[n-1] != 9)
        {
            digits[n-1] += 1;
            return digits;
        }
        
        else
        {
            int carry = 1;
            digits[n-1] = 0;
            int i = n-2;
            while(i>=0)
            {
                if(digits[i]+carry == 10)
                {
                    digits[i] = 0;
                    carry =1;
                }
                else
                {
                    digits[i] += carry;
                    carry = 0;
                }
                i--;
            }
            
            if(carry == 0)
                return digits;
            else
            {
                int nums[] = new int[n+1];
                nums[0] = 1;
                for(i=0; i<n; i++)
                    nums[i+1] = digits[i];
                return nums;
            }
        }
    }
}