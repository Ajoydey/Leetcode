class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                map.putIfAbsent(i - j, new PriorityQueue<>());
                map.get(i - j).offer(mat[i][j]);
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                mat[i][j] = map.get(i - j).poll();
            }
        }
        return mat;
    }
}
/*
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        //follow hints
        int rows = mat.length;
        int cols = mat[0].length;
        int diff = cols-1;
        List<List<Integer>> temp = new ArrayList<>(rows+cols-1);
        for(int i =0; i<rows+cols-1; i++)
        {
            temp.add(i, new ArrayList<>());
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                (temp.get(i-j+diff)).add(mat[i][j]);
            }
        }
        for(int i=0; i<rows+cols-1; i++)
        {
            Collections.sort(temp.get(i));
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                mat[i][j] = (temp.get(i-j+diff)).get(0);
                (temp.get(i-j+diff)).remove(0);
            }
        }
        return mat;
    }
}*/