class Solution {
    public long putMarbles(int[] weights, int k) {
        // PriorityQueue<Long> pq1=new PriorityQueue<>();
        // PriorityQueue<Long> pq2=new PriorityQueue<>(Collections.reverseOrder());
        int n=weights.length;
        long ans[]=new long[n-1];
        
        for(int i=0;i<n-1;i++){
            long sum=weights[i]+weights[i+1];
            ans[i]=sum;
        }


        Arrays.sort(ans);

        long fin=0;
        for(int i=0;i<k-1;i++){
            fin-=ans[i];
            fin+=ans[n-2-i];
        }


        return fin;


        
    }
}