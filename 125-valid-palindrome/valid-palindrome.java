class Solution {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[\\W_]", "").toLowerCase();
        return isPalindrome(s, 0, s.length() - 1);
    }
    public static boolean isPalindrome(String str, int start, int end){
        if (start>= end){
            return true;
        }
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}