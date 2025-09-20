class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for (int n: nums){
            pQueue.add(n);
            while (pQueue.size() > k){
                //remove the top element
                pQueue.remove();
            }
        }
        return pQueue.remove();
    }
}