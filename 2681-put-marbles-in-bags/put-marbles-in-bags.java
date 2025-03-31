class Solution {
    public long putMarbles(int[] weights, int k) {
        PriorityQueue<Long> pq1=new PriorityQueue<>();
        PriorityQueue<Long> pq2=new PriorityQueue<>(Collections.reverseOrder());
        
        int n=weights.length;
        for(int i=0;i<n-1;i++){
            long sum=weights[i]+weights[i+1];
            pq1.add(sum);
            pq2.add(sum);
        }

        long ans1=0,ans2=0;
        k--;
        while(k>0){
            long p1=pq1.remove();
            long p2=pq2.remove();
            ans1+=p1;
            ans2+=p2;
            k--;
        }

        return ans2-ans1;


        
    }
}