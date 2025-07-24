class Solution {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums, goal) - helper(nums, goal - 1);
    }
    public static int helper(int [] nums, int goal){
        int start = 0;
        int end = 0;
        int sum = 0;
        int countOfSubarray = 0;
        if (goal < 0){
            return 0;
        }
        while (end < nums.length){
            sum += nums[end];
            while (sum > goal) {
                sum -= nums[start];
                start++;
            }
            countOfSubarray += end - start + 1;
            end++;
        }
        return countOfSubarray;
    }
}