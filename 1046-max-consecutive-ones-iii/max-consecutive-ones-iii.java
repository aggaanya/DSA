class Solution {
    //this not the optimized solution but the better one
    public static int longestOnes(int [] nums, int k){
        int left = 0;
        int right = 0;
        int zeroes = 0;
        int currentLength = 0;
        int maxLength = Integer.MIN_VALUE;

        //right will be traversing to the size of the list
        while(right < nums.length){
            if (nums[right] == 0){
                zeroes++;
            }
            //if the count of zero is > k, than
            while(zeroes > k){
                //1st we will be finding the initial zero, and subtracting it to the count of the zero to make it <= k
                if (nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}