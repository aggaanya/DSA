class Solution {
    public static int [] searchRange(int [] nums, int target){
        int firstPosition = -1;
        int lastPosition = -1;
        for (int start = 0; start < nums.length; start++) {
            if (nums[start] == target){
                firstPosition = start;
                break;
            }
        }
        for (int end = nums.length - 1; end >= 0; end--) {
            if (nums[end] == target){
                lastPosition = end;
                break;
            }
        }
        return new int []{firstPosition, lastPosition};
    }
}