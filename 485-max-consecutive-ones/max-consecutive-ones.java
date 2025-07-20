class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; int length = 0;
        for (int num: nums){
            if (num == 0){
                count = 0;
            }else{
                count++;
                length = Math.max(length, count);
            }
        }
        return length;
    }
}