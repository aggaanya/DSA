class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOcc = -1;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                firstOcc = i;
                break;
            }
        }
        int lastOcc = -1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(target == nums[i]){
                lastOcc = i;
                break;
            }
        }
        if(firstOcc != -1 && lastOcc != -1){
            return new int[]{firstOcc, lastOcc};
        }
        return new int[]{firstOcc, lastOcc};
    }
}