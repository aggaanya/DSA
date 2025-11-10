class Solution {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        int y = n - 1;
        if (n > 0){
            return (n & y) == 0;
        }
        return false;
    }
}