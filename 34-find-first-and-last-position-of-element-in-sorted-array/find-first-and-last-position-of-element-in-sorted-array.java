class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        int start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int first = searchLeft(nums, start, end, target);
        int last = searchRight(nums, start, end, target);
        if(first != -1){
            ans[0] = first;
        }
        if(last != -1){
            ans[1] = last;
        }
        return ans;
    }
    public static int searchLeft(int [] nums, int start, int end, int target){
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                res = mid;
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }

    public static int searchRight(int [] nums, int start, int end, int target){
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                res = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return res;
    }
}