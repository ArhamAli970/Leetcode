class SeatManager {
    PriorityQueue<Integer> pq;
    HashSet<Integer> h;
    public SeatManager(int n) {
        pq= new PriorityQueue<>();
        h=new HashSet<>();
        for(int i=1;i<=n;i++){pq.add(i);}
    }
    
    public int reserve() {
         if(!pq.isEmpty()){
        int val=pq.remove();
       h.add(val);
       return val;
       }
        return -1;
    }
    
    public void unreserve(int seatNumber) {
        if(h.contains(seatNumber)){h.remove(seatNumber);
        pq.add(seatNumber);}
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */