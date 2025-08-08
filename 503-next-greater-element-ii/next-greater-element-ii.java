class Solution {
    public static int[] nextGreaterElements(int[] nums) {
        //this is the circular array problem
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = -1;
            for (int j = i + 1; j <= nums.length - 1 + i; j++) {
                int index = j % nums.length;
                if (nums[index] > nums[i]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }
        return ans;
    }
}