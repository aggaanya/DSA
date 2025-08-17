class Solution {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (nums[middle] == target){
                return middle;
            }
            //identify the sorted part in the arary
            if (nums[middle] >= nums[start]){
                //left half is sorted
                if (nums[start] <= target && target <= nums[middle]){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
            else {
                if (nums[middle] <= target && target <= nums[end]){
                    start = middle + 1;
                }else{
                    end = middle -1;
                }
            }
        }
        return -1;
    }
}