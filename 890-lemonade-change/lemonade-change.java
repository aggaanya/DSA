class Solution {
    public static boolean lemonadeChange(int[] bills) {
        //take the pointers of those, money which we can return
        int five = 0;
        int ten = 0;
        int i = 0;
        boolean ans = true;
        while (i < bills.length){
            if (bills[i] == 5){
                five += 1;
            } else if (bills[i] == 10) {
                //checking if I have 5$
                if (five < 1){
                    return false;
                }else {
                    //we have taken the $10 but have to return 5$
                    ten += 1;
                    five -= 1;
                }
            }else{
                //checking the condition for 20$
                //if i taking 20$ than I have to return 15$ in return
                if (ten >= 1 && five >= 1){
                    five -= 1;
                    ten -= 1;
                }else if(five >= 3) {
                    five -= 3;

                }else {
                    return false;
                }
            }
            i++;
        }
        return ans;
    }
}