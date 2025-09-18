class Solution {
    public static boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        if(n <= 0){
            return false;
        }
        if(n % 3 != 0){
            //this means that this number is not divisible by 3
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}