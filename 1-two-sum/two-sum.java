class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int start = 0; start < nums.length - 1; start++) {
            for (int end = start + 1; end < nums.length; end++) {
                int sum = nums[start];
                sum = sum + nums[end];
                if(target == sum){
                    return new int[]{start, end};
                }
            }
        }
        return new int[]{-1, -1};
    }
}