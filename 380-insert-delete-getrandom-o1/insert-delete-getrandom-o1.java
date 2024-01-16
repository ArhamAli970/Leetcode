class RandomizedSet {

    static HashMap<Integer,Integer> mp;
    static ArrayList<Integer> al;

    public RandomizedSet() {
        
        mp= new HashMap<>();
        al= new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)){
            return false;
        }
        al.add(val);
        mp.put(val,al.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)){return false;}
        int idx=mp.get(val);
        int lst=al.get(al.size()-1);

        al.set(idx,lst);
        mp.put(lst,idx);

        al.remove(al.size()-1);
        mp.remove(val); 
    
return true;

    }
    
    public int getRandom() {
        int size=al.size();
     int idx=(int)Math.floor(Math.random()*size);
     return al.get(idx);   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */