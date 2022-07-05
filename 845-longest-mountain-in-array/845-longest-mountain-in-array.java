class Solution {
    public int longestMountain(int[] arr) {
        
        int n = arr.length;
        // dp arrays to store increasing or decreasing value of each index
        int[] inc = new int[n];
        int[] dec = new int[n];
        
        //initiliazation
        inc[0] = 0;
        dec[n-1] = 0;
         
        for(int i=1; i<n; i++)
        {
            if(arr[i]>arr[i-1])
                inc[i] = 1+inc[i-1];
            else
                inc[i] = 0;
        }
        for(int i=n-2; i>0; i--)
        {
            if(arr[i]>arr[i+1])
                dec[i] = 1+dec[i+1];
            else
                dec[i] = 0;
        }
        int length = 0;
        for(int i=0; i<n; i++)
        {
            if(dec[i]!=0 && inc[i]!=0)
            length = Math.max(length, dec[i]+inc[i]+1);
        }
        return length;
        
    }
}
/*
    public int longestMountain(int[] arr) {
    if(arr.length < 3){
        return 0;
    }
    int longest = 0;
    for(int i = 1; i < arr.length - 1; i++){
        if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
            int left = i;
            int right = i;
            
            //find peak and exapnd from both sides  peak =i
            
            while(left > 0 && arr[left - 1] < arr[left]){
                left--;
            }
            while(right < arr.length - 1 && arr[right + 1] < arr[right]){
                right++;
            }
            longest = Math.max(right - left + 1, longest);
        }
    }
    return longest;
}
*/