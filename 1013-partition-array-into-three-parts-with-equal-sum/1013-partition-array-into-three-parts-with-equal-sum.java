class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum =0;
        for(int num: arr)
            totalSum+=num;
        if(totalSum%3 != 0)
            return false;
        int partitionSum = totalSum/3;
        int tempSum = 0, count=0;
        for(int num: arr)
        {
            tempSum+=num;
            if(tempSum == partitionSum)
            {
                count++;
                tempSum = 0;
            }
            if(count == 3)
                return true;
        }
        return false;
    }
}