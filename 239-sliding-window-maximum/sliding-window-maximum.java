class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
    int[] res = new int[nums.length - k + 1];
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    int j = 0;
    for (int index = 0; index < nums.length; index++) {
        while (!queue.isEmpty() && nums[queue.getLast()] < nums[index]) {
            queue.removeLast(); // Fix here
        }
        queue.addLast(index);
        if (queue.getFirst() <= index - k) {
            queue.removeFirst();
        }
        if (index >= k - 1) {
            res[j++] = nums[queue.getFirst()];
        }
    }
    return res;
}
}