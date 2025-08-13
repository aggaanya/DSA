class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int n: nums1){
            map1.put(n, map1.getOrDefault(n, 0) + 1);
        }
        for (int n: nums2){
            map2.put(n, map2.getOrDefault(n,0) + 1);
        }

        for (int key: map1.keySet()){
            if (map2.containsKey(key)){
                //compare the value and add it to the list
                int count = Math.min(map1.get(key), map2.get(key));
                for (int i = 0; i < count; i++) {
                    ans.add(key);
                }
            }
        }
        int [] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}