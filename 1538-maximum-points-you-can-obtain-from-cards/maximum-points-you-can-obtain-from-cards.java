class Solution {
    public static int maxScore(int[] cardPoints, int k) {
        int Left_Sum = 0;
        int sum;
        int n = cardPoints.length;

        // Sum of the first k elements
        for (int i = 0; i < k; i++) {
            Left_Sum += cardPoints[i];
        }

        if (k == n) return Left_Sum;

        sum = Left_Sum;
        int MaxSum = sum;

        int left = k - 1;
        int right = n - 1;
        int count = 0;  // count how many elements swapped

        while (count < k) {
            sum = sum - cardPoints[left] + cardPoints[right];
            MaxSum = Math.max(MaxSum, sum);
            left--;
            right--;
            count++;
        }

        return MaxSum;
    }
}