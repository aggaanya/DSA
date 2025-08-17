class Solution {
    public static int findMin(int[] nums) {
        int ans = findMinimumInRotated(nums);
        if (ans == -1){
            return nums[0];
        }
        return ans;
    }
    public static int findMinimumInRotated(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        //if the array have only 1 element
        if (nums.length == 1){
            return nums[0];
        }
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (middle < end && nums[middle] > nums[middle + 1]) return nums[middle + 1];
            else if (middle > start && nums[middle] < nums[middle - 1]) return nums[middle];
            else if (nums[start] >= nums[middle])  end = middle - 1;
            else start = middle + 1;
        }
        return -1;
    }
}