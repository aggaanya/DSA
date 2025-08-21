class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        if (k < 1) return 0;
        for (int start = 0; start < nums.length; start++) {
            int prod = 1;
            for (int end = start; end < nums.length; end++) {
                prod *= nums[end];
                if (prod < k)count++;
                else break;
            }
        }
        return count;
    }
}