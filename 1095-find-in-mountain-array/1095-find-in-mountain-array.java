/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        // first step will be finding pivot. Array left of pivot is continuously increasing, to the right of pivot is continuously decreasing
        int low = 0;
        int high = mountainArr.length()-1;
        
        int pivot = findPivot(low, high, mountainArr);
        
        if(mountainArr.get(pivot) == target)
            return pivot;
        
        else
        {
            int left = binarySearch(low, pivot-1, target, mountainArr, true);
            if(left != -1)
                return left;
            else{
                int right = binarySearch(pivot+1, high, target, mountainArr, false);
                if(right != -1)
                    return right;
                else 
                    return -1;
            }
        }
    }
    
    public int findPivot(int low, int high, MountainArray mountainArr){
        while(low<=high){
            
            int mid = low + (high-low)/2;
            int middle_ele = mountainArr.get(mid);
            
            if(middle_ele>mountainArr.get(mid-1) && middle_ele>mountainArr.get(mid+1))
                return mid;
            else if(middle_ele>mountainArr.get(mid-1) && middle_ele<mountainArr.get(mid+1)) //if cotinuously increasing we must check mid + right half
                low = mid;
            else  // check left half + mid
                high = mid;
        }
        return -1;
    }
    
    public int binarySearch(int low, int high, int target, MountainArray mountainArr, boolean flag){
        // flag value will decide whether we are going for left side or right side of the array
        
        while(low<=high){
            
            int mid = low + (high-low)/2;
            int middle_ele = mountainArr.get(mid);
            
            if(flag) // left half which is an increasing array
            {
                
                    if(middle_ele == target)
                        return mid;
                    else if(middle_ele > target)
                        high = mid-1;
                    else
                        low = mid+1;
                
            }
            
            else  //right side which is a decreasing array
            {
                
                    if(middle_ele == target)
                        return mid;
                    else if(middle_ele > target)
                        low = mid+1;
                    else
                        high = mid-1;
                
            }
            
            
        }
        return -1;
    }
}