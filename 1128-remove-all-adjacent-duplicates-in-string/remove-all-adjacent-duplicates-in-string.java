class Solution {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < s.length()){
            if(!stack.isEmpty() && stack.peek() == s.charAt(index)){
                stack.pop();
            }
            else {
                stack.push(s.charAt(index));
            }
            index++;
        }
        StringBuilder ans = new StringBuilder();
        for (Character ch: stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}