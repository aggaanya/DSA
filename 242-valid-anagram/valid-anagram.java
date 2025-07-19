class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMap = new HashMap<>();
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();

        for (char ch: str1){
            //counting the frequency of each character
            if (countMap.containsKey(ch)){
                //if the character is already present in the hashmap increase the frequency
                countMap.put(ch, countMap.get(ch) + 1);
            }else{
                countMap.put(ch, 1);
            }
        }
        Map<Character, Integer> countMap2 = new HashMap<>();
        //now i have compare the frequency from the second string
        for (char ch: str2){
            //counting the frequency of each character
            if (countMap2.containsKey(ch)){
                //if the character is already present in the hashmap increase the frequency
                countMap2.put(ch, countMap2.get(ch) + 1);
            }else{
                countMap2.put(ch, 1);
            }
        }
        return countMap.equals(countMap2);
    }
}