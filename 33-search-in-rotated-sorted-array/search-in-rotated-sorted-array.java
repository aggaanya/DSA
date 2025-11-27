class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = helper(nums);
        int ans = BinarySearch(nums, start, target, index - 1);
        if(ans == -1){
            return BinarySearch(nums, index, target, end);
        }
        return ans;
    }
    //this function will return the index of the target element
    public int BinarySearch(int [] arr, int start, int target, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
    //this function will return the index of the minimum element in the array 
    public int helper(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            int prev = (mid + arr.length - 1) % arr.length;
            int next = (mid + 1) % arr.length;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }else if(arr[mid] >= arr[end]){
                start = mid + 1;
                }else{
                     end = mid - 1;
        }
    }
        return 0;
    }
}