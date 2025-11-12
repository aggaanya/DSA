class Solution {
    public static int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        divide(nums, low, high);
        return nums;
    }
    static void divide(int [] arr, int low, int high){
        if (low >= high){
            return;
        }
        int middle = low + (high - low) / 2;
        divide(arr, low, middle);
        divide(arr, middle + 1, high);
        merge(arr, low, middle, high);
    }
    static void merge(int [] arr, int low, int middle, int high){
        int [] mix = new int[high - low + 1];
        int k = 0;
        int start = low;
        int end = middle + 1;
        while (start <= middle && end <= high){
            if (arr[start] <= arr[end]){
                mix[k++] = arr[start++];
            }else{
                mix[k++] = arr[end++];
            }
        }
        while (start <= middle){
            mix[k++] = arr[start++];
        }
        while (end <= high){
            mix[k++] = arr[end++];
        }
        for (int i = 0; i < mix.length; i++){
            arr[low + i] = mix[i];
        }
    }
}