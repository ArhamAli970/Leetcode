class AllOne {
static HashMap<String,Integer> mp;
static TreeMap<Integer,HashSet<String>> m1;
    public AllOne() {
        mp=new HashMap<>();
        m1=new TreeMap<>();
    }
    
    public void inc(String key) {
        mp.put(key,mp.getOrDefault(key,0)+1);
        int cnt=mp.get(key);
        if(cnt>1){
            m1.get(cnt-1).remove(key);
            if(m1.get(cnt-1).size()==0){m1.remove(cnt-1);}
        }
        if(!m1.containsKey(cnt)){
                m1.put(cnt,new HashSet<>());
        }
        m1.get(cnt).add(key);
    }
    
    public void dec(String key) {

        mp.put(key,mp.get(key)-1);
        int cnt=mp.get(key);
        
        m1.get(cnt+1).remove(key);
        if(m1.get(cnt+1).size()==0){m1.remove(cnt+1);}
        if(cnt==0){return;}
        if(!m1.containsKey(cnt)){
                m1.put(cnt,new HashSet<>());
        }
        m1.get(cnt).add(key);
        
    }
    
    public String getMaxKey() {
        if(m1.size()==0){return "";}
        HashSet<String> h=m1.get(m1.lastKey());
        for(String i:h){
            return i;
        }

        return "";
    }
    
    public String getMinKey() {
        if(m1.size()==0){return "";}
        HashSet<String> h=m1.get(m1.firstKey());
         for(String i:h){
            return i;
        }

        return "";
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */