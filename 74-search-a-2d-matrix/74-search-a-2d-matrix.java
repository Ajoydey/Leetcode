class Solution {
    public boolean binSearch(int[] arr, int target, int low, int high)
    {
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid]>target)
                high = mid-1;
            else
                low = mid+1;
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        //two fold binary search first for rows if potential match for that particular row then
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int low=0, high=rows-1;
        boolean ans=false;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            
            if(target<matrix[mid][0])  //search in upper half
                high = mid-1;
            else if(target>matrix[mid][columns-1])  //search in lower half
                low = mid+1;
            else  //present in that row
                return binSearch(matrix[mid], target, 0, columns-1);
        }
        return ans;
    }
    

}