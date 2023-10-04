class MyHashMap {

static HashMap<Integer,Integer> mp;
    public MyHashMap() {
        mp= new HashMap<>();
    }
    
    public void put(int key, int value) {
        mp.put(key,value);
    }
    
    public int get(int key) {
        if(mp.get(key)==null){return -1;}
        return mp.get(key);
    }
    
    public void remove(int key) {
        mp.remove(key);
    
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */