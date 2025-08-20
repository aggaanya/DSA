class Solution {
    public static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotate(int[][] matrix) {
        //transpose the matrix
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = row + 1; col < matrix[row].length; col++) {
                if (row != col) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
        }
        //reverse the ro
        for (int i = 0; i < matrix.length; i++) {
            reverseRow(matrix[i]);
        }
    }
}