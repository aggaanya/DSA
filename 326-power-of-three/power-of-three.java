class Solution {
    public static boolean isPowerOfThree(int n) {
        double ans = Math.log10(n) / Math.log10(3);
        return ans == (int)ans;
    }
}