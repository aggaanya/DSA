class Solution {
    public boolean isValid(int maxSum, int [] arr, int k){
        int partitions = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > maxSum){
                partitions++;
                sum = arr[i];
            }
            if(partitions > k){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int max = -1;
        int sum = 0;
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isValid(mid, nums, k)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}