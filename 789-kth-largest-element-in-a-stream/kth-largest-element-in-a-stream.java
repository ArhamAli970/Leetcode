class KthLargest {
static PriorityQueue<Integer> pq;
static int ls;
    public KthLargest(int k, int[] nums) {
      pq=new PriorityQueue<>();
      ls=k;
      for(int i:nums){pq.add(i);}
      while(!pq.isEmpty() && pq.size()>k){pq.remove();}
    }
    
    public int add(int val) {
        pq.add(val);
       // System.out.print(pq);
        if(pq.size()>ls){pq.remove();}
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */