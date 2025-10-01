class Solution {
    public int addDigits(int num) {
        //if the num is of the single digit, return the number itself
        if(num <= 9){
            return num;
        }
        else if(num % 9 == 0){
            return 9;
        }
        else{
            return num % 9;
        }
    }
}