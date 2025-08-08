class Solution {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        // Traverse the array twice to simulate circular behavior
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            // Maintain decreasing stack
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }
            // Only fill answer during the first pass
            if (i < n) {
                ans[index] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[index]);
        }
        return ans;
    }
}