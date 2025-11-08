class Solution {
    public void rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        k = k % nums.length;
        reverse(nums, start, end);

        reverse(nums, start, k - 1);

        reverse(nums, k, end);
    }
    public void reverse(int [] arr, int s, int e){
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}