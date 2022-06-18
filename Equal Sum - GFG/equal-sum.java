// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String equilibrium(int arr[], int n) {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        sum+=arr[i];
        
        //fiding left_sum and correspnding right_sum
        int leftsum=arr[0], rightsum=0;
        for(int i=1; i<arr.length-1; i++)
        {
            rightsum = sum-leftsum-arr[i];
            if(leftsum==rightsum)   //check
            return "YES";
            leftsum+=arr[i];   //updating leftsum
        }
        return "NO";
    }
}