class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        //this is the actual sum of the array
        for(int n: nums){
            sum += n;
        }
        int BigSum = 0;
        for(int i = 1; i <= nums.length; i++){
            BigSum += i;
        }
        return BigSum - sum;
    }
}