class Solution {

    static class node implements Comparable <node>{
        int dest,cst;
        node(int dest,int cst){
            this.dest=dest;
            this.cst=cst;
        }

        public int compareTo(node p ){
            return this.cst-p.cst;
        }
    }

    static class nd {
        int dest,cst;
        nd(int dest,int cst){
            this.dest=dest;
            this.cst=cst;
        }

    }



    public int findTheCity(int n, int[][] edges, int distanceThreshold) {


        ArrayList<nd> arr[]=new ArrayList[n];

        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i[]:edges){
            arr[i[0]].add(new nd(i[1],i[2]));
            arr[i[1]].add(new nd(i[0],i[2]));
        }
int min=Integer.MAX_VALUE,city=-1;
        for(int i=0;i<n;i++){
            PriorityQueue<node> pq=new PriorityQueue<>();
            pq.add(new node(i,0));
            int cnt=0;
            boolean vis[]=new boolean[n];

            while(!pq.isEmpty()){
                node curr=pq.remove();
                if(vis[curr.dest]){continue;}
                vis[curr.dest]=true;
                cnt++;

                int cost=curr.cst;int src=curr.dest;

                for(int j=0;j<arr[src].size();j++){
                    nd destination=arr[src].get(j);
                    int expecteddest=destination.dest;
                    int expectedcost=cost+destination.cst;
                    
                    if(expectedcost<=distanceThreshold && !vis[expecteddest]){
                        pq.add(new node(expecteddest,expectedcost));

                    }
                    
                }

            }
            if(cnt<=min){
                min=cnt;
                city=i;
            }

        }

        return city;


        
    }
}