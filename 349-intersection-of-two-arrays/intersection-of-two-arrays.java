class Solution {
    public static int [] intersection(int [] num1, int [] num2){
        //this is the set that will contain all the unique elements of arr1
        HashSet<Integer> set = new HashSet<>();
        for (int n: num1){
            set.add(n);
        }
        List<Integer> list = new ArrayList<>();
        for(int num: num2){
            //now we are checking that does the second array numbers consists in set array
            if (set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int [] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}