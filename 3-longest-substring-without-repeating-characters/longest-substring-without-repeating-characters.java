class Solution {
    public static int lengthOfLongestSubstring(String str){
        int start = 0;
        int end = 0;
        int length = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(end < str.length()){
            char ch = str.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, end);
            length = Math.max(length, end-start+1);
            end++;
        }
        return length;
    }
}