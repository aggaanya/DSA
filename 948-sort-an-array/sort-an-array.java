class Solution {
    public int[] sortArray(int[] nums) {
        //this is the maxHeap, as we want the max element in the last index of the array
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int n: nums)
            MaxHeap.add(n);
        int size = MaxHeap.size();
        int [] ans = new int[size];
        int j = ans.length - 1;
        for (int i = 0; i < size; i++) {
            int element = MaxHeap.remove();
            ans[j] = element;
            j--;

        }
        return ans;
    }
}