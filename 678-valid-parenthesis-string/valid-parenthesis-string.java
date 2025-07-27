class Solution {
    public static boolean checkValidString(String s) {
        Stack<Integer> openParatheses = new Stack<>();
        Stack<Integer> asterisk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('(' == ch){
                //add the index of that element into the stack
                openParatheses.push(i);
            } else if ('*' == ch) {
                //add this element index into the astrisk stack
                asterisk.push(i);
            }else{
                if (ch == ')'){
                    //checking if the openParatheses is empty or not, of it is not empty than we can nullify the ')'
                    if (!openParatheses.isEmpty()){
                        //now pop the element from the openParantheses as it has been nullified from the open stack
                        openParatheses.pop();
                    } else if (!asterisk.isEmpty()) {
                        //it is the case when * is before ) , the condition of ( before * will defined later
                        asterisk.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        while (!asterisk.isEmpty() && !openParatheses.isEmpty()){
            //if the index of * is before the (
            if (asterisk.peek() < openParatheses.peek()){
                return false;
            }
            openParatheses.pop();
            asterisk.pop();

        }
        return openParatheses.isEmpty();
    }
}