class Solution {
    public int subtractProductAndSum(int n) {
        int a = addition(n);
        int b = multiplication(n);
        return b - a;
    }
    //in this function i am calculating the addition of the number
    public int addition(int n){
        //base condition
        if(n % 10 == n){
            return n;
        }
        return (n % 10) + addition(n / 10);
    }
    //in this function i will be calculating the product of the number
    public int multiplication(int n){
        //base condition
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * multiplication(n / 10);
    }
}