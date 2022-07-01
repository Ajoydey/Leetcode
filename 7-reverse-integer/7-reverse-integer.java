class Solution {
    public int reverse(int x) {
        int output = 0;
        while(x != 0){
            int lastDigit = x % 10;
            
            //check overflow first
            if(output > (Integer.MAX_VALUE - Math.abs(lastDigit)) / 10 || output < (Integer.MIN_VALUE + Math.abs(lastDigit)) / 10){
                return 0;
            }
            
            //get x's last digit and add to the output
            output = output * 10 + lastDigit;
            
            //remove x's last digit
            x = x / 10;
        }
        
        return output;
    }
}