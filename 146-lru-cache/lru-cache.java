class LRUCache {
static int time,cap;
static HashMap<Integer,node> mp;
static Queue<node> q;
 
 static class node{
    int val,time;
    node(int val,int time){
        this.val=val;
        this.time=time;
    }
 }

    public LRUCache(int capacity) {
        cap=capacity;
        time=0;
        q=new LinkedList<>();
        mp=new HashMap<>();
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            q.add(new node(key,time));
            mp.get(key).time=time;
            time++;
            return mp.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        mp.put(key,new node(value,time));
        while(mp.size()>cap){
            node curr=q.remove();
            if(mp.get(curr.val).time==curr.time){
                mp.remove(curr.val);
            }
        }
        q.add(new node(key,time));
        time++;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */