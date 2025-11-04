class Solution {
    public int firstUniqChar(String s) {
        int index = -1;

        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            //if the character is there in the map, than we will be getting its frequency
            //else, the frequecy will be set it to the 0
            int freq = map.getOrDefault(ch, 0);

            map.put(ch, freq + 1); 
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                index = i;
                break;
            }
        }
        return index;
    }
}