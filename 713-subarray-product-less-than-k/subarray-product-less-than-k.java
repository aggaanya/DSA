class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)return 0;
        int prod = 1, ans = 0;
        for(int left = 0, right = 0; right < nums.length; ++right){
            prod *= nums[right];
            while (prod >= k) {
                //start removing the elements
                prod /= nums[left++];
            }
            ans += right - left + 1;
        }
        return ans;
    }
}