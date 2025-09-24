class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         //this is the max heap, top elements are the larger elements
        PriorityQueue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    int cmp = b.difference.compareTo(a.difference); // max heap by difference
                    if (cmp == 0) {
                        return b.value.compareTo(a.value); // tie-breaker
                    }
                    return cmp;
                }
        );
        int i = 0;
        while (i < arr.length){
            //this is the difference, and taking the absolute value
            int diff = Math.abs(arr[i] - x);
            //adding the pairs into the heap
            maxHeap.add(new Pair<>(diff, arr[i]));
            if (maxHeap.size() > k){
                //start removing the elements from the heap, and the elements which will be get removed will be having high difference
                maxHeap.remove();
            }
            i++;
        }
        List<Integer> list = new ArrayList<>();
        while (!maxHeap.isEmpty()){
            int number = maxHeap.remove().value;
            list.add(number);
        }
        Collections.sort(list);
        return list;
    }
}
public class Pair <X, Y>{
    X difference;
    Y value;

    public Pair(X difference, Y value) {
        this.difference = difference;
        this.value = value;
    }
}