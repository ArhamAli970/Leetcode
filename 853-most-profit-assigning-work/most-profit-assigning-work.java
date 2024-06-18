class Solution {
    class node implements Comparable <node>{
        int d,c;
        node(int d,int c){
            this.d=d;
            this.c=c;
        }
        public int compareTo(node p){
            return p.c-this.c;
        }
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int pt=0,n=difficulty.length;

        Arrays.sort(worker);

        PriorityQueue<node> pq=new PriorityQueue<>();


        for(int i=0;i<n;i++){
            pq.add(new node(difficulty[i],profit[i]));
        }


        int j=worker.length-1;

        // System.out.print(pq.peek().c);

        while(j>=0 && pq.size()>0){
            while(!pq.isEmpty() && worker[j]<pq.peek().d){
                pq.remove();
            }
            if(!pq.isEmpty()){pt+=pq.peek().c;
            j--;}
        }


        return pt;

        


        
    }
}