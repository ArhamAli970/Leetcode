class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans=0;
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            pq.add((long)i);
        }

        while(k>0){
            // System.out.print(pq);
            long key=pq.remove();
            ans+=key;
            long curr=key/3;
            if(key%3!=0){++curr;}
            pq.add(curr);
            k--;
        }

        return ans;
        
    }
}