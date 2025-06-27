// import java.util.*;
class RandomizedSet {
    static HashMap<Integer,Integer> mp;
    static ArrayList<Integer> arr;
    
    public RandomizedSet() {
        arr=new ArrayList<>();
        mp=new HashMap<>();
    
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)){return false;}
        arr.add(val);
        mp.put(val,arr.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)){return false;}
        int idx=mp.get(val);
        int x=arr.get(arr.size()-1);
        mp.put(arr.get(arr.size()-1),idx);
        arr.set(idx,x);
        arr.remove(arr.size()-1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        int sz=arr.size();
        int rn=(int)Math.floor(Math.random()*sz);
        return arr.get(rn);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */