class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            visited[i] = false;
        }
        return reach(arr, visited, start);
    }
    public boolean reach(int[] arr, boolean[] visited, int start)
    {
        if(start<0 || start>=arr.length || visited[start])
            return false;
        else if(arr[start] == 0)
            return true;
        else
        {
            visited[start] = true;
            return reach(arr, visited, start+arr[start]) || reach(arr, visited, start-arr[start]);
        }
    }
}