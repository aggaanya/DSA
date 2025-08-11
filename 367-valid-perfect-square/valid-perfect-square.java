class Solution {
    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num/2;
        if (num == 0 || num == 1){
            return true;
        }
        while (start <= end){
            long middle = start + (end - start) / 2;
            if (middle*middle == num){
                return true;
            } else if (middle*middle < num) {
                start = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        return false;
    }
}