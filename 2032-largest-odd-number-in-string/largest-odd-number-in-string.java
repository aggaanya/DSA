class Solution {
    public static String largestOddNumber(String num) {
        int end = num.length() - 1;
        String ans = "";
        int requiredIndex = -1;
        while (end >= 0){
            if (num.charAt(end) % 2 != 0){
                //we have found the odd integer, now we have to make the substring
                //get the index of that integer
                requiredIndex = end;
                break;
            }
            end--;
        }
        for (int i = 0; i <= requiredIndex; i++) {
            ans += num.charAt(i);
        }
        return ans;
    }
}