class Solution {
    public static void main(String[] args) {
        int num = 14;
        int ans = numberOfSteps(num);
        System.out.println(ans);
    }
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    static int helper(int nums, int count){
        if (nums == 0){
            return count;
        }
        if (nums % 2 == 0){
            return helper(nums / 2, count+1);
        }
        return helper(nums - 1, count  + 1);
    }
}