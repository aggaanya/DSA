class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int number: nums){
            if (map.containsKey(number) && Math.abs(idx - map.get(number)) <= k){
                return true;
            }else {
                map.put(number, idx);
            }
            idx++;
        }
        return false;
    }
}