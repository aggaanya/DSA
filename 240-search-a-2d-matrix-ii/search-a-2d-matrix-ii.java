class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length - 1;
        while (start < matrix.length && end >= 0){
            if (target < matrix[start][end]){
                end--;
            }
            else if (target == matrix[start][end]) {
                return true;
            }
            else {
                start++;
            }
        }
        return false;
    }
}