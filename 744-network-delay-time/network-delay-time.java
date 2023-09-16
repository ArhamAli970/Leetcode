class Solution {

static class node implements Comparable <node> { 

     int dest;int cost;
     node(int dest,int cost){
         this.dest=dest;this.cost=cost;
     } 

     @Override
     public int compareTo(node p2){ 
         return this.cost-p2.cost;
     }
   
}

    public int networkDelayTime(int[][] times, int n, int k) {

          ArrayList<node> arr[]=new ArrayList[n+1];
          HashSet<Integer> h=new HashSet<>();

          for(int i=1;i<=n;i++){ 
              h.add(i);
          }

          for(int i=0;i<=n;i++){ 
              arr[i]=new ArrayList<>();
          }

          for(int i=0;i<times.length;i++){ 
              arr[times[i][0]].add(new node(times[i][1],times[i][2]));
          }

          
          PriorityQueue<node> pq= new PriorityQueue<>(); 
          int cost=0;

          pq.add(new node(k,0));

          while(!pq.isEmpty()){ 
             
               node curr=pq.remove();
               cost=Math.max(curr.cost,cost);
               h.remove(curr.dest);
                 if(h.size()==0){return cost;}
               for(int i=0;i<arr[curr.dest].size();i++){ 
                   node now=arr[curr.dest].get(i);
                   if(h.contains(now.dest)){ 
                       pq.add(new node(now.dest,now.cost+curr.cost));
                   }
               }

          }


return -1;
    }
}