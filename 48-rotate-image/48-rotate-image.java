class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        transpose(matrix, rows, cols);
        reverseIndRows(matrix, rows, cols);
    }
    public void transpose(int[][] matrix, int rows, int cols){
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<i; j++)
            {
                swap(matrix, i, j);
            }
        }
        
    }
    public void reverseIndRows(int[][] matrix, int rows, int cols)
    {
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols/2; j++)
            {
                swapInRows(matrix, i, j, cols-j-1);
            }
        }
    }
    public void swapInRows(int[][] matrix, int row, int i, int j)
    {
        int temp = matrix[row][i];
        matrix[row][i] = matrix[row][j];
        matrix[row][j] = temp;
    }
    public void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}