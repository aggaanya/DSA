class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums.length){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            i++;
        }
        for (int key: map.keySet()){
            if (map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}