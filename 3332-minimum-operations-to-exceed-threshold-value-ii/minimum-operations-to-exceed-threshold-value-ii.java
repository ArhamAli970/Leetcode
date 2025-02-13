class Solution {
    public int minOperations(int[] nums, int k) {
     
        PriorityQueue<Long> pq= new PriorityQueue<>();
        for(int i:nums){
            pq.add((long)i);
        }
        
        int cnt=0;
        while(pq.size()>1 && pq.peek()<k){
            long e1=pq.remove();
            long e2=pq.remove();
            
            long ans=Math.min(e1,e2)*2+Math.max(e1,e2);
            pq.add(ans);
            cnt++;
        }
        
        return cnt;
    }
}