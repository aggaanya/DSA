class Solution {
    boolean isValid(int [] arr, int d, int size, int MaxWeight){
        int days = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > MaxWeight){
                days++;
                sum = arr[i];
            }
            if(days > d){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        for(int i = 0; i < weights.length; i++){
            total += weights[i];
        }
        int max = -1;
        for(int j = 0; j < weights.length; j++){
            if(max < weights[j]){
                max = weights[j];
            }
        }
        int start = max;
        int end = total;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(isValid(weights, days, weights.length - 1, mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}