class Graph {
static ArrayList<node> a[];

static class node{
int dest,cost;
node(int dest,int cost){ 
    this.dest=dest;
    this.cost=cost;
}
}

static class node1 implements Comparable<node1>{ 
    int dest,cost;
    node1(int dest,int cost){ 
        this.dest=dest;this.cost=cost;
    }
    @Override
 public int compareTo(node1 p){ 
         return this.cost-p.cost;
 }
}

    public Graph(int n, int[][] edges) {
       a=new ArrayList[n]; 
       for(int i=0;i<n;i++){a[i]=new ArrayList<>();}
       for(int i=0;i<edges.length;i++){ 
            int edge[]=edges[i];
            a[edge[0]].add(new node(edge[1],edge[2]));
       }
    }
    
    public void addEdge(int[] edge) {
        a[edge[0]].add(new node(edge[1],edge[2]));
    }
    
    public int shortestPath(int n1, int n2) {
        if(n1==n2){return 0;}
        PriorityQueue<node1> pq= new PriorityQueue<>();
        HashSet<Integer> h= new HashSet<>();
        System.out.println(a);
        pq.add(new node1(n1,0));
        
        while(!pq.isEmpty()){ 

            node1 curr= pq.remove(); 
            if(curr.dest==n2){return curr.cost;}
            h.add(curr.dest);

            for(int i=0;i<a[curr.dest].size();i++){ 
                node d=a[curr.dest].get(i);
               if(!h.contains(d.dest)){ 
                   pq.add(new node1(d.dest,curr.cost+d.cost));
               }
            }

        }

        return -1;

    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */