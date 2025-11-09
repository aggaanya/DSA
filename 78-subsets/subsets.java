class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int [] arr) {
        helper(arr, 0, new ArrayList<>());
        return list;
    }
    public void helper(int [] arr, int index, List<Integer> ans){
        if (index == arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[index]);
        helper(arr, index + 1, ans);
        //we have to remove the lst element from the ans list
        ans.remove(ans.size()-1);
        helper(arr, index + 1, ans);
    }
}