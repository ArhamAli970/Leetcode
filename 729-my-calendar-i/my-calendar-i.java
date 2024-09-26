class MyCalendar {
static TreeMap<Integer,Integer> mp;
    public MyCalendar() {
        mp=new TreeMap<>();
        mp.put(Integer.MAX_VALUE,Integer.MAX_VALUE);
        mp.put(Integer.MIN_VALUE,Integer.MIN_VALUE);
    }
    
    public boolean book(int st, int end) {

        int key=mp.ceilingKey(st);
        if(key<end){return false;}

        key=mp.floorKey(st);
        int val=mp.get(key);
        if(val>st || val>=end){return false;}
        
        mp.put(st,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */