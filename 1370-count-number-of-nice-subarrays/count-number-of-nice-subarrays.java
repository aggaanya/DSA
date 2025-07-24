class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
    public static int helper(int [] nums, int k){
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        if (k < 0){
            return 0;
        }
        while (end < nums.length){
            sum += nums[end] % 2;
            while (sum > k){
                sum -= nums[start] % 2;
                start++;
            }
            count += end - start + 1;
            end++;
        }
        return count;
    }
}