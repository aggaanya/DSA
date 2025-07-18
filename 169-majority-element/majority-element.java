class Solution {
    public static int majorityElement(int [] arr){
        HashMap<Integer, Integer> set = new HashMap<>();

        if(arr.length == 0){
            return -1;
        }
        for (int num: arr){
            if (set.containsKey(num)){
                //ths is the condition when the element is already existing in the hashmap
                set.put(num, set.get(num) + 1);
            }else{
                //if the element does not exist in hashmap
                set.put(num, 1);
            }
        }
        //set.keySet()--> this will return the entire key set
        for(int key: set.keySet()){
            if (set.get(key) > arr.length / 2){
                return key;
            }
        }
        return -1;
    }
}