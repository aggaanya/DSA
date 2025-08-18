class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, currentSlideSum = 0, length = Integer.MAX_VALUE;

        while (start < nums.length){
            currentSlideSum += nums[start++];

            while (currentSlideSum >= target){
                length = Math.min(length, start - end);
                currentSlideSum -= nums[end++];
            }
        }
        return length == Integer.MAX_VALUE ? 0: length;
    }
}