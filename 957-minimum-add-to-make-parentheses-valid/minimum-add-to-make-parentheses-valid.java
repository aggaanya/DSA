class Solution {
    public int minAddToMakeValid(String s) {
        //creating a stack
        Stack<Character> stack = new Stack<>();
        int open = 0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    open++;
                }
            }
        }
        if(!stack.isEmpty()){
            return stack.size() + open;
        }
        return open + stack.size();
    }
}