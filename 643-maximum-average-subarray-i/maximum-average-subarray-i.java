class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans;
        double sum = 0;
        for (int index = 0; index < k; index++) {
            sum += nums[index];
        }ans = sum / k;

        double avg;

        for (int index = k; index < nums.length; index++) {
            sum += nums[index] - nums[index - k];
            avg = sum / k;
            ans = Math.max(avg, ans);
        }
        return ans;
    }
}