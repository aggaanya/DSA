class Solution {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        String newStr  = s.stripTrailing();
        char [] ch = new char[newStr.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = newStr.charAt(i);
        }
        int i = newStr.length() - 1;
        while (i >= 0){
            if (ch[i] == ' '){
                break;
            }
            count++;
            i--;
        }
        return count;
    }
}