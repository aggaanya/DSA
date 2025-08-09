class Solution {
    static int trap(int [] height){
        int amount = 0;
        int [] prefix = new int[height.length];
        prefix[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            prefix[i] = Math.max(height[i], prefix[i-1]);
        }
        int [] suffix = new int[height.length];
        suffix[suffix.length - 1] = height[height.length - 1];
        for (int i = suffix.length - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            int leftMax = prefix[i];
            int rightMax = suffix[i];
            amount += Math.max(0, Math.min(leftMax, rightMax) - height[i]);
        }
        return amount;
    }
}