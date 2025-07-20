class Solution {
    public static int totalFruit(int[] fruits) {
        int start = 0;
        int end = 0;
        int length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (end < fruits.length) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            if (map.size() > 2) {
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0) {
                    //remove the element from the map
                    map.remove(fruits[start]);
                }
                start++;
            }
            length = Math.max(length, end - start + 1);
            end++;
        }
        return length;
    }
}