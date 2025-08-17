class Solution {
    //In this question, I will be using gaussian method
    public static int missingNumber(int [] nums) {
        //this was the hidden concept behind this question to get the value of n
        int n = nums.length;
        int gaussianFormula = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return gaussianFormula - sum;
    }
}