class Solution {
    public static int possibleStringCount(String word) {
        char [] ch = word.toCharArray();
        int count = 0;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ch[i]){
                count++;
            }
        }
        return count + 1;
    }
}