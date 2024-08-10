class Solution {
    static class node  implements Comparable <node>{
        int i,cst;
        node(int cst,int i){
            this.cst=cst;
            this.i=i;
        }

        public int compareTo(node p){
            return this.cst-p.cst;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int cost=0;
        int n=points.length;
        boolean vis[]=new boolean[n];

        PriorityQueue<node> pq= new PriorityQueue<>();
        int v=n;
        pq.add(new node(0,0));

        while(v>0){
            node curr=pq.remove();
            if(vis[curr.i]){continue;}
            int idx=curr.i;
            cost+=curr.cst;
            int x=points[idx][0],y=points[idx][1];
            vis[idx]=true;
            for(int j=0;j<n;j++){
                if(vis[j]){continue;}
                int sumx=Math.abs(x-points[j][0]);
                int sumy=Math.abs(y-points[j][1]);
                pq.add(new node(sumy+sumx,j));
            }
            --v;
        }

        return cost;


    }
}