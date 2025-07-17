class Solution {
    public static int [] twoSum(int [] nums, int target){
        //we will sort the array in increasing order
        Arrays.sort(nums);
        int sum;
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            sum = nums[i] + nums[j];
            if(target == sum){
                return new int[]{i+1, j+1};
            }
            if (sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}