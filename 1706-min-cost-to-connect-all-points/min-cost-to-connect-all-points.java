class Solution {

    static class node implements Comparable <node>{ 
        int idx,d;

        node(int idx,int d){ 
            this.idx=idx;
            this.d=d;
        }

        @Override
        public int compareTo(node p){ 
            return this.d-p.d;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        // boolean vis[]= new boolean[n];
        int dist=0;
        HashSet<Integer> h= new HashSet<>();
        for(int i=0;i<n;i++){ 
            h.add(i);
        }

        PriorityQueue<node> pq= new PriorityQueue<>();
        int cnt=n;

        pq.add(new node(0,0));

        while(!pq.isEmpty() && cnt>0){ 
            node curr=pq.remove();
            if(h.contains(curr.idx)){cnt--;dist+=curr.d;}
            else if(!h.contains(curr.idx)){continue;}
            h.remove(curr.idx);
            for(int i :h){ 
            
                    int manHatt=Math.abs(points[curr.idx][0]-points[i][0])+Math.abs(points[curr.idx][1]-points[i][1]);
                    pq.add(new node(i,manHatt));
            
            }

        }


return dist;



        
    }
}