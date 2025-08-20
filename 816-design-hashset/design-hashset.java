class MyHashSet {

    ArrayList<Integer> set;
    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(int key) {
        //as the hashset doen not contain the duplicates we have to keep the check on that
        //hence we will be adding/inserting the values in the arraylist/set only when 
        //the set will not consisting of the element
        //therefore
        if(!set.contains(key))set.add(key);
    }

    public void remove(int key) {
        if (set.isEmpty()){
            return;
        }
        set.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        if (set.isEmpty()){
            return false;
        }
        for (int val: set){
            if (val == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */