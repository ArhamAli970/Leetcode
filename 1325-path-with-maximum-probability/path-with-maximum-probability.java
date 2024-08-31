class Solution {
    static ArrayList<node> arr[];
    static class node implements Comparable <node>{
        int st;double dist;
        node(int st,double dist){
            this.st=st;
            this.dist=dist;
        }

        public int compareTo(node p){
            return Double.compare(p.dist,this.dist);
        }

    }




    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        arr=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            int s=edges[i][0],e=edges[i][1];double d=succProb[i];
            arr[s].add(new node(e,d));
            arr[e].add(new node(s,d));
        }

        PriorityQueue<node> pq=new PriorityQueue<>();

        pq.add(new node(start_node,1.0));
        boolean vis[]=new boolean[n];

        while(!pq.isEmpty()){
           node curr=pq.remove();
           if(curr.st==end_node){return curr.dist;}
           if(vis[curr.st]){continue;}
           vis[curr.st]=true;
        

           for(int i=0;i<arr[curr.st].size();i++){
              node ed=arr[curr.st].get(i);
              int dst=ed.st;
              if(!vis[dst]){
                pq.add(new node(dst,curr.dist*ed.dist));
              }
           }

        }


return (double)0;

    }
}