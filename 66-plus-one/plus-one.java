class Solution {
    public static int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        for (int i = 0; i < digits.length; i++) {
            if (digits[lastIndex] < 9){
                //we just need to add 1 to it
                digits[lastIndex] = digits[lastIndex] + 1;
                return digits;
            }else{
                digits[lastIndex] = 0;
                lastIndex--;
            }
        }
        if (digits[0] == 0){
            int [] ans = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                if (i == 0){
                    ans[i] = 1;
                }else{
                    ans[i] = 0;
                }
            }
            return ans;
        }
        return digits;
    }
}